package com.gatepay.core.api.payment.model.v2.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;

/**
 * 退款
 *
 * @author bourne-be
 * @date 2025/8/27 00:09
 * @Copyright: All rights Reserved, Designed By GatePay
 */
public class CreateRefundReqV2 extends BaseRequest {

    // 商户退款单id
    private String refundRequestId;

    // 正向支付单id
    private String prepayId;

    // 退款金额
    private String refundAmount;

    // 退款原因
    private String refundReason;

    // 退款方式 1:原路退 2:指定退
    private Integer refundStyle;

    // 退款支付方式 1:Gate 2:Web3
    private Integer refundPayChannel;

    // 退款：收款方的用户 GateId
    private Long refundToGateUid;

    // 退款地址
    private String refundAddress;

    // 退款网络
    private String refundChain;

    // 退款承担类型 1:需商家承担，2:需用户承担
    private Integer refundBearType;

    // 转账memo
    private String memo;

    public CreateRefundReqV2() {
        this.api = GatePayApi.PAYMENT_CREATE_REFUND_V2;
    }

    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public Integer getRefundStyle() {
        return refundStyle;
    }

    public void setRefundStyle(Integer refundStyle) {
        this.refundStyle = refundStyle;
    }

    public Integer getRefundPayChannel() {
        return refundPayChannel;
    }

    public void setRefundPayChannel(Integer refundPayChannel) {
        this.refundPayChannel = refundPayChannel;
    }

    public Long getRefundToGateUid() {
        return refundToGateUid;
    }

    public void setRefundToGateUid(Long refundToGateUid) {
        this.refundToGateUid = refundToGateUid;
    }

    public String getRefundAddress() {
        return refundAddress;
    }

    public void setRefundAddress(String refundAddress) {
        this.refundAddress = refundAddress;
    }

    public String getRefundChain() {
        return refundChain;
    }

    public void setRefundChain(String refundChain) {
        this.refundChain = refundChain;
    }

    public Integer getRefundBearType() {
        return refundBearType;
    }

    public void setRefundBearType(Integer refundBearType) {
        this.refundBearType = refundBearType;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
