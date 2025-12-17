package com.gatepay.core.api.payment.model.v2.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.annotation.GatePayParam;
import com.gatepay.common.enums.GatePayApi;

/**
 * 订单查询请求 - V3
 *
 * @author bourne-be
 * @date 2025/8/26 17:38
 * @Copyright: All rights Reserved, Designed By GatePay
 */
public class QueryOrderReqV2 extends BaseRequest {

    @GatePayParam(required = false)
    private String prepayId;

    @GatePayParam(required = false)
    private String merchantTradeNo;

    public QueryOrderReqV2() {
        this.api = GatePayApi.PAYMENT_QUERY_ORDER_V2;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getMerchantTradeNo() {
        return merchantTradeNo;
    }

    public void setMerchantTradeNo(String merchantTradeNo) {
        this.merchantTradeNo = merchantTradeNo;
    }
}
