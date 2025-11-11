package com.gatepay.core.api.gift.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

public class CreateResp extends BaseResponse<CreateResp> {

    /**
     * 礼品卡卡号
     */
    @JsonProperty("card_num")
    private String cardNum;

    /**
     * 礼品卡兑换码
     */
    @JsonProperty("card_key")
    private String cardKey;

    /**
     * 礼品卡金额
     */
    private String amount;

    /**
     * 礼品卡币种
     */
    private String currency;

    /**
     * 礼品卡状态
     */
    private String status;

    // 0 未知状态
    // 1 礼品卡待支付
    // 2 未兑换
    // 3 已兑换
    // 4 冻结
    // 5 支付失败
    // 6 人工审核
    // 7 审核驳回
    // 8 审核支付失败

    /**
     * 礼品卡封面ID
     */
    @JsonProperty("card_temp_id")
    private String cardTempId;

    /**
     * 创建人
     */
    private long creator;

    /**
     * 礼品卡创建人名字
     */
    @JsonProperty("creator_name")
    private String creatorName;

    @JsonProperty("exchange_uid")
    private long exchangeUid;

    private long owner;

    @JsonProperty("give_count")
    private long giveCount;

    @JsonProperty("last_give_time")
    private long lastGiveTime;

    /**
     * 创建时间
     */
    @JsonProperty("create_time")
    private String createTime;

    private String batchId;



    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardKey() {
        return cardKey;
    }

    public void setCardKey(String cardKey) {
        this.cardKey = cardKey;
    }

    public String getCardTempId() {
        return cardTempId;
    }

    public void setCardTempId(String cardTempId) {
        this.cardTempId = cardTempId;
    }

    public long getCreator() {
        return creator;
    }

    public void setCreator(long creator) {
        this.creator = creator;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public long getExchangeUid() {
        return exchangeUid;
    }

    public void setExchangeUid(long exchangeUid) {
        this.exchangeUid = exchangeUid;
    }

    public long getOwner() {
        return owner;
    }

    public void setOwner(long owner) {
        this.owner = owner;
    }

    public long getGiveCount() {
        return giveCount;
    }

    public void setGiveCount(long giveCount) {
        this.giveCount = giveCount;
    }

    public long getLastGiveTime() {
        return lastGiveTime;
    }

    public void setLastGiveTime(long lastGiveTime) {
        this.lastGiveTime = lastGiveTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

}
