package com.gatepay.core.api.payment.model.v2.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

import java.util.List;

/**
 * 退款查询响应 V3
 *
 * @author bourne-be
 * @date 2025/8/27 10:06
 * @Copyright: All rights Reserved, Designed By GatePay
 */
public class QueryRefundRespV2 extends BaseResponse<QueryRefundRespV2> {

    // 商户退款订单号
    private String refundRequestId;

    // Gate退款订单号
    private String gateRefundId;

    // 商家退款订单号（发起退款的 refundRequestId）
    private String refundId;

    // GatePay支付订单号（原始正向订单的 orderId）
    private String orderId;

    // 商户订单号（原始正向订单的 merchantTradeNo）
    private String merchantTradeNo;

    // 退款单创建时间
    private long createTime;

    // 支付时间
    private long transactTime;

    // 支付流水订单号
    private String transactionId;

    // 交易hash
    private String txHash = "";

    // 订单金额
    private String orderAmount;

    // 订单币种
    private String orderCurrency;

    // 申请退款金额
    private String requestAmount;

    // 申请退款币种
    private String requestCurrency;

    // 退款金额
    private String amount;

    // 退款币种
    private String currency;

    // 退款状态
    private String status;

    // 退款订单备注
    private String remark;

    // 退款方式 1:原路退 2:指定退
    @JsonProperty("refund_style")
    private int refundStyle;

    // 退款支付方式 1:gate 2:web3
    @JsonProperty("refund_pay_channel")
    private int refundPayChannel;

    // 退款地址
    @JsonProperty("refund_address")
    private String refundAddress;

    // 退款网络
    @JsonProperty("refund_chain")
    private String refundChain;

    // 退款承担类型 1:需商家承担，2:需用户承担
    @JsonProperty("refund_bear_type")
    private int refundBearType;

    // 退款金额类型 1:全部退 2:部分退
    @JsonProperty("refund_amount_type")
    private int refundAmountType;

    // 退款扣款账户类型，1:支付账户 2:现货账户
    @JsonProperty("refund_account_type")
    private int refundAccountType;

    // 退款手续费，只有退到web3有
    @JsonProperty("refund_gas_amount")
    private String refundGasAmount;

    // 退款失败原因
    @JsonProperty("refund_fail_reason")
    private String refundFailReason;

    // 退款至gate用户uid
    @JsonProperty("refund_to_gate_uid")
    private long refundToGateUid;

    // 客户渠道名称
    private String channelId;

    // 用户昵称
    private String nickName;

    // 用户UID
    private long payerId;

    // 付款地址
    private String fromAddress;

    // 退款详情列表
    private List<RefundDetailItem> refundDetails;

    // 支付渠道
    private String payChannel;

    // 账单类型
    private int billType;

    // 商品名称
    private String goodsName;

    // 订单维度-申请退款金额
    private String totalRequestAmount;

    // 订单维度-申请退款币种
    private String totalRequestCurrency;

    // 订单维度-实际到账订单金额
    private String totalReceiveAmount;

    // 订单维度-实际到账订单币种
    private String totalReceiveCurrency;

    public static class RefundDetailItem {
        // 支付流水订单号
        private String transactionId;

        // 支付时间
        private long transactTime;

        // 支付渠道，用于判断支付方式
        private String payChannel;

        // 支付状态
        private String status;

        // 退款金额
        private String amount;

        // 退款币种
        private String currency;

        // 网络币种
        private String chain;

        // 商户收款地址
        private String address;

        // 交易hash
        private String hash;

        // 备注
        private String remark;

        // 账单类型
        private int billType; // uint8 in Go, using int in Java

        public String getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }

        public long getTransactTime() {
            return transactTime;
        }

        public void setTransactTime(long transactTime) {
            this.transactTime = transactTime;
        }

        public String getPayChannel() {
            return payChannel;
        }

        public void setPayChannel(String payChannel) {
            this.payChannel = payChannel;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

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

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public int getBillType() {
            return billType;
        }

        public void setBillType(int billType) {
            this.billType = billType;
        }
    }

    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId;
    }

    public String getGateRefundId() {
        return gateRefundId;
    }

    public void setGateRefundId(String gateRefundId) {
        this.gateRefundId = gateRefundId;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMerchantTradeNo() {
        return merchantTradeNo;
    }

    public void setMerchantTradeNo(String merchantTradeNo) {
        this.merchantTradeNo = merchantTradeNo;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getTransactTime() {
        return transactTime;
    }

    public void setTransactTime(long transactTime) {
        this.transactTime = transactTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTxHash() {
        return txHash;
    }

    public void setTxHash(String txHash) {
        this.txHash = txHash;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderCurrency() {
        return orderCurrency;
    }

    public void setOrderCurrency(String orderCurrency) {
        this.orderCurrency = orderCurrency;
    }

    public String getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(String requestAmount) {
        this.requestAmount = requestAmount;
    }

    public String getRequestCurrency() {
        return requestCurrency;
    }

    public void setRequestCurrency(String requestCurrency) {
        this.requestCurrency = requestCurrency;
    }

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getRefundStyle() {
        return refundStyle;
    }

    public void setRefundStyle(int refundStyle) {
        this.refundStyle = refundStyle;
    }

    public int getRefundPayChannel() {
        return refundPayChannel;
    }

    public void setRefundPayChannel(int refundPayChannel) {
        this.refundPayChannel = refundPayChannel;
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

    public int getRefundBearType() {
        return refundBearType;
    }

    public void setRefundBearType(int refundBearType) {
        this.refundBearType = refundBearType;
    }

    public int getRefundAmountType() {
        return refundAmountType;
    }

    public void setRefundAmountType(int refundAmountType) {
        this.refundAmountType = refundAmountType;
    }

    public int getRefundAccountType() {
        return refundAccountType;
    }

    public void setRefundAccountType(int refundAccountType) {
        this.refundAccountType = refundAccountType;
    }

    public String getRefundGasAmount() {
        return refundGasAmount;
    }

    public void setRefundGasAmount(String refundGasAmount) {
        this.refundGasAmount = refundGasAmount;
    }

    public String getRefundFailReason() {
        return refundFailReason;
    }

    public void setRefundFailReason(String refundFailReason) {
        this.refundFailReason = refundFailReason;
    }

    public long getRefundToGateUid() {
        return refundToGateUid;
    }

    public void setRefundToGateUid(long refundToGateUid) {
        this.refundToGateUid = refundToGateUid;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public long getPayerId() {
        return payerId;
    }

    public void setPayerId(long payerId) {
        this.payerId = payerId;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getTotalRequestAmount() {
        return totalRequestAmount;
    }

    public void setTotalRequestAmount(String totalRequestAmount) {
        this.totalRequestAmount = totalRequestAmount;
    }

    public String getTotalRequestCurrency() {
        return totalRequestCurrency;
    }

    public void setTotalRequestCurrency(String totalRequestCurrency) {
        this.totalRequestCurrency = totalRequestCurrency;
    }

    public String getTotalReceiveAmount() {
        return totalReceiveAmount;
    }

    public void setTotalReceiveAmount(String totalReceiveAmount) {
        this.totalReceiveAmount = totalReceiveAmount;
    }

    public String getTotalReceiveCurrency() {
        return totalReceiveCurrency;
    }

    public void setTotalReceiveCurrency(String totalReceiveCurrency) {
        this.totalReceiveCurrency = totalReceiveCurrency;
    }

    public List<RefundDetailItem> getRefundDetails() {
        return refundDetails;
    }

    public void setRefundDetails(List<RefundDetailItem> refundDetails) {
        this.refundDetails = refundDetails;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public int getBillType() {
        return billType;
    }

    public void setBillType(int billType) {
        this.billType = billType;
    }
}
