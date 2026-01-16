/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment.model.v2.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 标准查询订单响应 V3
 * @Author Bourne-BE
 * @Date 2025/08/26
 */
public class QueryOrderRespV2 extends BaseResponse<QueryOrderRespV2> {

    private String prepayId;
    private long merchantId;
    private String merchantTradeNo;
    private String transactionId;
    private String goodsName;
    private String currency;
    private String orderAmount;
    private String surchargeAmount;
    private String status;
    private long createTime;
    private long expireTime;
    private long transactTime;
    private String expectCurrency;
    private String actualCurrency;
    private String actualAmount;
    private String rate;
    private String appName;
    private String appLogo;
    private String inUsdt;
    private String channelId;

    @JsonProperty("order_name")
    private String orderName;

    @JsonProperty("pay_currency")
    private String payCurrency;

    @JsonProperty("pay_amount")
    private String payAmount;

    @JsonProperty("channel_type")
    private String channelType;

    @JsonProperty("pay_account")
    private String payAccount;

    private String totalFee =  "";
    private String returnUrl =  "";
    private String merchantName = "";

    private String location = "";
    private String scheme = "";
    private QueryOrderRespV2.WhiteBrandInfo whiteBrandInfo = null;


    @JsonProperty("qrcode")
    private String qrCode = "";


    /**
     * Web3支付相关的参数
     */
    private String txHash = "";

    private String address = "";

    private String chain = "";

    private String fullCurrType =  "";

    private String fromAddress = "";

    private String showChainNameEn = "";

    @JsonProperty("transaction_info")
    private ChainTransactionInfo transactionInfo;

    public static class ChainTransactionInfo {

        @JsonProperty("done_amount")
        private String doneAmount = "";

        @JsonProperty("confirming_list")
        private List<ConfirmItem> confirmingList = new ArrayList<>();

        public String getDoneAmount() {
            return doneAmount;
        }

        public void setDoneAmount(String doneAmount) {
            this.doneAmount = doneAmount;
        }

        public List<ConfirmItem> getConfirmingList() {
            return confirmingList;
        }

        public void setConfirmingList(List<ConfirmItem> confirmingList) {
            this.confirmingList = confirmingList;
        }
    }

    public static class ConfirmItem {

        private String amount = "";

        private int confirm = 0;

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public int getConfirm() {
            return confirm;
        }

        public void setConfirm(int confirm) {
            this.confirm = confirm;
        }
    }

    public static class WhiteBrandInfo {
        private String logoUrl = "";
        private String brand = "";
        private String[] payWays = new String[0];

        public String getLogoUrl() {
            return logoUrl;
        }

        public void setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String[] getPayWays() {
            return payWays;
        }

        public void setPayWays(String[] payWays) {
            this.payWays = payWays;
        }
    }


    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantTradeNo() {
        return merchantTradeNo;
    }

    public void setMerchantTradeNo(String merchantTradeNo) {
        this.merchantTradeNo = merchantTradeNo;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public long getTransactTime() {
        return transactTime;
    }

    public void setTransactTime(long transactTime) {
        this.transactTime = transactTime;
    }

    public String getExpectCurrency() {
        return expectCurrency;
    }

    public void setExpectCurrency(String expectCurrency) {
        this.expectCurrency = expectCurrency;
    }

    public String getActualCurrency() {
        return actualCurrency;
    }

    public void setActualCurrency(String actualCurrency) {
        this.actualCurrency = actualCurrency;
    }

    public String getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(String actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppLogo() {
        return appLogo;
    }

    public void setAppLogo(String appLogo) {
        this.appLogo = appLogo;
    }

    public String getInUsdt() {
        return inUsdt;
    }

    public void setInUsdt(String inUsdt) {
        this.inUsdt = inUsdt;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
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

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public String getTxHash() {
        return txHash;
    }

    public void setTxHash(String txHash) {
        this.txHash = txHash;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public WhiteBrandInfo getWhiteBrandInfo() {
        return whiteBrandInfo;
    }

    public void setWhiteBrandInfo(WhiteBrandInfo whiteBrandInfo) {
        this.whiteBrandInfo = whiteBrandInfo;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getFullCurrType() {
        return fullCurrType;
    }

    public void setFullCurrType(String fullCurrType) {
        this.fullCurrType = fullCurrType;
    }

    public String getShowChainNameEn() {
        return showChainNameEn;
    }

    public void setShowChainNameEn(String showChainNameEn) {
        this.showChainNameEn = showChainNameEn;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public ChainTransactionInfo getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(ChainTransactionInfo transactionInfo) {
        this.transactionInfo = transactionInfo;
    }
    public String getSurchargeAmount() {
        return surchargeAmount;
    }

    public void setSurchargeAmount(String surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
    }
}
