package com.gatepay.core.api.payment.model.v2.resp;

import com.gatepay.common.BaseResponse;

/**
 * 退款响应
 *
 * @author bourne-be
 * @date 2025/8/27 00:16
 * @Copyright: All rights Reserved, Designed By GatePay
 */
public class CreateRefundRespV2 extends BaseResponse<CreateRefundRespV2> {

    private String refundRequestId;

    private String refundGateId;

    private String prepayId;

    private String orderAmount;

    private String refundAmount;

    private String errMsg;

    private String orderCurrency;

    private String payCurrency;

    private String payAmount;

    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId;
    }

    public String getRefundGateId() {
        return refundGateId;
    }

    public void setRefundGateId(String refundGateId) {
        this.refundGateId = refundGateId;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getOrderCurrency() {
        return orderCurrency;
    }

    public void setOrderCurrency(String orderCurrency) {
        this.orderCurrency = orderCurrency;
    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public void setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }
}
