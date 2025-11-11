/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.BaseResponse;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.annotation.GatePayRespData;
import com.gatepay.common.enums.Code;
import com.gatepay.common.enums.Status;
import com.gatepay.common.model.resp.SpecResp;
import com.gatepay.common.utils.RandomUtils;
import com.gatepay.common.utils.StringUtils;
import com.gatepay.core.api.withdraw.model.req.QueryBalanceReq;
import com.gatepay.core.api.withdraw.model.req.QueryStatusReq;
import com.gatepay.core.api.withdraw.model.resp.QueryBalanceResp;
import com.gatepay.core.api.withdraw.model.resp.QueryStatusResp;
import com.gatepay.infrastructure.GatePayConfig;
import com.gatepay.infrastructure.GatePayHttpClient;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


/**
 * @Description 基础api
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class BaseApi {

    /**
     * gatePay http客户端
     */
    private final GatePayHttpClient gatePayHttpClient;

    public BaseApi(GatePayConfig gatePayConfig) {
        this.gatePayHttpClient = new GatePayHttpClient(gatePayConfig);
    }


    /**
     * 前置处理
     * @param req
     * @param <Req>
     * @return
     * @throws IllegalAccessException
     */
    private <Req extends BaseRequest> boolean preProcess(Req req) throws IllegalAccessException {
        for (Field field : req.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(GatePayParam.class) && field.getAnnotation(GatePayParam.class).required()) {
                field.setAccessible(Boolean.TRUE);
                if (field.get(req) == null) {
                    throw new RuntimeException("Field " + field.getName() + " is required!");
                }
            }
        }
        return Boolean.TRUE;
    }

    /**
     * 处理请求
     * @param req
     * @return
     * @param <Req>
     * @throws IOException
     * @throws IllegalAccessException
     * @throws InterruptedException
     */
    private <Req extends BaseRequest> HttpResponse<String> doProcess(Req req) throws IOException, IllegalAccessException, InterruptedException {
        HttpRequest httpRequest = this.gatePayHttpClient.generateHttpRequest(req, System.currentTimeMillis(), RandomUtils.generateNonce(9));
        return this.gatePayHttpClient.getHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
    }

    /**
     * 后置处理
     * @param json
     * @param respClass
     * @return
     * @param <Resp>
     * @throws JsonProcessingException
     * @throws NoSuchMethodException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    private <Req extends BaseRequest, Resp extends BaseResponse> Resp postProcess(String json, Req req, Class<Resp> respClass) throws JsonProcessingException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        if (StringUtils.isEmpty(json)) {
            return respClass.getDeclaredConstructor().newInstance();
        }
        boolean existGatePayRespData = false;
        for (Field field : respClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(GatePayRespData.class)) {
                existGatePayRespData = true;
                break;
            }
        }
        if (existGatePayRespData) {
            SpecResp<Resp> specResp = new SpecResp();
            specResp.setData(respClass.getDeclaredConstructor().newInstance());
            SpecResp returnSpecResp = new ObjectMapper().readValue(json, specResp.getClass());
            Resp resp = respClass.getDeclaredConstructor().newInstance();
            resp.setCode(returnSpecResp.getCode());
            resp.setStatus(returnSpecResp.getStatus());
            resp.setLabel(returnSpecResp.getLabel());
            resp.setErrorMessage(returnSpecResp.getErrorMessage());
            resp.setData(returnSpecResp.getData());
            return resp;
        }
        try {
            Resp abnormalResp = postProcessAbnormal(json, req, respClass);
            if (abnormalResp != null) {
                return abnormalResp;
            }
            Resp failResp = postProcessFail(json, respClass);
            if (failResp != null) {
                return failResp;
            }
            return new ObjectMapper().readValue(json, respClass);
        } catch (Exception e) {
            Resp resp = respClass.getDeclaredConstructor().newInstance();
            resp.setCode(Code.FAIL.getCode());
            resp.setStatus(Status.FAIL.name());
            resp.setErrorMessage(new ObjectMapper().writeValueAsString(json));
            return resp;
        }
    }

    private <Req extends BaseRequest, Resp extends BaseResponse> Resp postProcessAbnormal(String json, Req req, Class<Resp> respClass) throws JsonProcessingException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        try {
            if (req instanceof QueryBalanceReq) {
                QueryBalanceResp queryBalanceResp = new ObjectMapper().readValue(json, QueryBalanceResp.class);
                Resp resp = respClass.getDeclaredConstructor().newInstance();
                resp.setCode(Code.SUCCESS.getCode());
                resp.setStatus(Status.SUCCESS.name());
                resp.setData(queryBalanceResp);
                return resp;
            }
            if (req instanceof QueryStatusReq) {
                QueryStatusResp[] queryStatusResps = new ObjectMapper().readValue(json, QueryStatusResp[].class);
                Resp resp = respClass.getDeclaredConstructor().newInstance();
                resp.setCode(Code.SUCCESS.getCode());
                resp.setStatus(Status.SUCCESS.name());
                resp.setData(queryStatusResps);
                return resp;
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    private <Req extends BaseRequest, Resp extends BaseResponse> Resp postProcessFail(String json, Class<Resp> respClass) throws JsonProcessingException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BaseResponse baseResponse = new ObjectMapper().readValue(json, BaseResponse.class);
        if (Status.FAIL.name().equals(baseResponse.getStatus())) {
            Resp resp = respClass.getDeclaredConstructor().newInstance();
            resp.setCode(baseResponse.getCode());
            resp.setStatus(baseResponse.getStatus());
            resp.setLabel(baseResponse.getLabel());
            resp.setErrorMessage(baseResponse.getErrorMessage() + ". " + new ObjectMapper().writeValueAsString(baseResponse.getData()));
            return resp;
        }
        return null;
    }



    /**
     * 处理请求
     * @param req
     * @param respClass
     * @return
     * @param <Req>
     * @param <Resp>
     */
    protected <Req extends BaseRequest, Resp extends BaseResponse> Resp process(Req req, Class<Resp> respClass) {
        try {
            preProcess(req);
            HttpResponse<String> httpResponse = doProcess(req);
            System.out.println("resp: " + httpResponse.body());
            return postProcess(httpResponse.body(), req, respClass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
