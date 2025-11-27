package com.gatepay.core.api.payment.model.v2.req;

import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;

/**
 * 退款到Web3，查询支持的网络和费率
 *
 * @author bourne-be
 * @date 2025/8/26 23:44
 * @Copyright: All rights Reserved, Designed By GatePay
 */
public class QueryRefundSupportChainsReq extends BaseRequest {

    // 币种
    private String currency;

    public QueryRefundSupportChainsReq() {
        this.api = GatePayApi.PAYMENT_QUERY_REFUND_SUPPORT_CHAINS_V2;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
