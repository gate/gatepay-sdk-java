/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.channelmanage.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.core.api.channelmanage.model.BaseMerchantChannel;
import com.gatepay.common.BaseRequest;
import com.gatepay.common.enums.GatePayApi;


/**
 * @description 更新请求
 * @author zj-be
 * @date 2025/7/30
 */
public class UpdateReq extends BaseRequest {

    /**
     * 商户渠道列表
     */
    @JsonProperty("merchantChannelList")
    private BaseMerchantChannel[] baseMerchantChannels;


    public UpdateReq() {
        this.api = GatePayApi.CHANNEL_MANAGE_UPDATE;
    }


    public BaseMerchantChannel[] getBaseMerchantChannels() {
        return baseMerchantChannels;
    }

    public void setBaseMerchantChannels(BaseMerchantChannel[] baseMerchantChannels) {
        this.baseMerchantChannels = baseMerchantChannels;
    }

}
