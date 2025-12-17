package com.gatepay.core.api.payment.model.v2.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * 退款详情查询 V3
 *
 * @author bourne-be
 * @date 2025/8/27 09:09
 * @Copyright: All rights Reserved, Designed By GatePay
 */
public class QueryRefundReqV2 extends BaseRequest {

    // 商户退款单id
    @GatePayParam
    private String refundRequestId;

    public QueryRefundReqV2() {
        this.api = GatePayApi.PAYMENT_QUERY_REFUND_V2;
    }

    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId;
    }
}
