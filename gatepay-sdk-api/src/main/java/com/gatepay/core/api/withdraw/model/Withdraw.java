/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.withdraw.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Description 提现请求参数
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class Withdraw {

    private long id;

    @JsonProperty("batch_id")
    private String batchId;

    @JsonProperty("merchant_id")
    private long merchantId;

    @JsonProperty("suborder_id")
    private String suborderId;

    @JsonProperty("withdraw_id")
    private String withdrawId;

    @JsonProperty("merchant_withdraw_id")
    private String merchantWithdrawId;
    private String currency;
    private String amount;
    private String chain;
    private String address;
    private String memo;
    private String fee;

    @JsonProperty("tx_id")
    private String txId;

    private long timestamp;

    @JsonProperty("create_time")
    private long createTime;

    @JsonProperty("update_time")
    private long updateTime;

    private String status;

    @JsonProperty("err_msg")
    private String errMsg;

    /*
    提现手续费的收取方式：
       如果选择内扣，则手续费将从提现金额中收取，到账金额为提现金额扣除手续费；
       如果选择外收，则手续费将从账户余额中扣除，到账金额即为提现金额。
    存量不传默认为内扣的方式
    类型枚举：
       0-内扣
       1-外收
    */
    @JsonProperty("fee_type")
    private int feeType;

    private String desc;

    @JsonProperty("channel_id")
    private long channelId;

    @JsonProperty("finish_time")
    private long finishTime;

    @JsonProperty("sub_amount")
    private String subAmount;

    @JsonProperty("done_amount")
    private String doneAmount;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getMerchantWithdrawId() {
        return merchantWithdrawId;
    }

    public void setMerchantWithdrawId(String merchantWithdrawId) {
        this.merchantWithdrawId = merchantWithdrawId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public int getFeeType() {
        return feeType;
    }

    public void setFeeType(int feeType) {
        this.feeType = feeType;
    }

    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public String getSuborderId() {
        return suborderId;
    }

    public void setSuborderId(String suborderId) {
        this.suborderId = suborderId;
    }

    public String getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(String withdrawId) {
        this.withdrawId = withdrawId;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getChannelId() {
        return channelId;
    }

    public void setChannelId(long channelId) {
        this.channelId = channelId;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    public String getSubAmount() {
        return subAmount;
    }

    public void setSubAmount(String subAmount) {
        this.subAmount = subAmount;
    }

    public String getDoneAmount() {
        return doneAmount;
    }

    public void setDoneAmount(String doneAmount) {
        this.doneAmount = doneAmount;
    }
}
