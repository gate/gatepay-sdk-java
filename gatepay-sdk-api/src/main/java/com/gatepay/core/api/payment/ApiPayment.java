/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment;

import com.gatepay.core.api.BaseApi;
import com.gatepay.core.api.payment.model.req.*;
import com.gatepay.core.api.payment.model.resp.*;
import com.gatepay.core.api.payment.model.v2.req.CreateRefundReqV2;
import com.gatepay.core.api.payment.model.v2.req.QueryOrderReqV2;
import com.gatepay.core.api.payment.model.v2.req.QueryRefundReqV2;
import com.gatepay.core.api.payment.model.v2.req.QueryRefundSupportChainsReq;
import com.gatepay.core.api.payment.model.v2.resp.CreateRefundRespV2;
import com.gatepay.core.api.payment.model.v2.resp.QueryOrderRespV2;
import com.gatepay.core.api.payment.model.v2.resp.QueryRefundRespV2;
import com.gatepay.core.api.payment.model.v2.resp.QueryRefundSupportChainsResp;
import com.gatepay.infrastructure.GatePayConfig;

/**
 * @Description 普通支付api
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class ApiPayment extends BaseApi {

    public ApiPayment(GatePayConfig gatePayConfig) {
        super(gatePayConfig);
    }


    /**
     * 创建订单
     * @param request
     * @return
     */
    public CreateOrderResp createOrder(CreateOrderReq request) {
        return super.process(request, CreateOrderResp.class);
    }


    /**
     * 查询订单
     * @param request
     * @return
     */
    public QueryOrderResp queryOrder(QueryOrderReq request) {
        return super.process(request, QueryOrderResp.class);
    }


    /**
     * 关闭订单
     * @param request
     * @return
     */
    public CloseOrderResp closeOrder(CloseOrderReq request) {
        return super.process(request, CloseOrderResp.class);
    }


    /**
     * 创建退款订单
     * @param request
     * @return
     */
    public CreateRefundResp createRefund(CreateRefundReq request) {
        return super.process(request, CreateRefundResp.class);
    }


    /**
     * 查询退款订单
     * @param request
     * @return
     */
    public QueryRefundResp queryRefund(QueryRefundReq request) {
        return super.process(request, QueryRefundResp.class);
    }


    /**
     * 创建批量转账
     * @param request
     * @return
     */
    public CreateBatchTransferResp createBatchTransfer(CreateBatchTransferReq request) {
        return super.process(request, CreateBatchTransferResp.class);
    }


    /**
     * 查询批量转账
     * @param request
     * @return
     */
    public QueryBatchTransferResp queryBatchTransfer(QueryBatchTransferReq request) {
        return super.process(request, QueryBatchTransferResp.class);
    }


    /**
     * 查询余额
     * @param request
     * @return
     */
    public QueryBalanceResp queryBalance(QueryBalanceReq request) {
        return super.process(request, QueryBalanceResp.class);
    }

    /**
     * 查询订单 V2
     * @param request
     * @return
     */
    public QueryOrderRespV2 queryOrderV2(QueryOrderReqV2 request) {
        return super.process(request, QueryOrderRespV2.class);
    }

    /**
     * 退款到 Web3 时，查询指定币种，支持的网络以及费率信息.
     * @param request
     * @return
     */
    public QueryRefundSupportChainsResp queryRefundSupportChains(QueryRefundSupportChainsReq request) {
        return super.process(request, QueryRefundSupportChainsResp.class);
    }

    /**
     * 退款： 支持退款到 Gate账户 和 Web3. V2
     * @param request
     * @return
     */
    public CreateRefundRespV2 createRefundV2(CreateRefundReqV2 request) {
        return super.process(request, CreateRefundRespV2.class);
    }

    /**
     * 退款详情查询 V3
     * @param request
     * @return
     */
    public QueryRefundRespV2 queryRefundV2(QueryRefundReqV2 request) {
        return super.process(request, QueryRefundRespV2.class);
    }

}
