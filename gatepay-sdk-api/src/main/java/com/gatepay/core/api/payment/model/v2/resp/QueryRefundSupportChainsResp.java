package com.gatepay.core.api.payment.model.v2.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

import java.util.List;

/**
 * 查询退款到Web3支持的网络和费率返回结果
 *
 * @author bourne-be
 * @date 2025/8/26 23:49
 * @Copyright: All rights Reserved, Designed By GatePay
 */
public class QueryRefundSupportChainsResp extends BaseResponse<QueryRefundSupportChainsResp> {

    private String currency;

    private List<ChainItem> chains;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<ChainItem> getChains() {
        return chains;
    }

    public void setChains(List<ChainItem> chains) {
        this.chains = chains;
    }

    public static class ChainItem {

        private String chain;

        private String currency;

        @JsonProperty("full_curr_type")
        private String fullCurrType;

        private String symbol;

        @JsonProperty("explorer_url")
        private String explorerUrl;

        @JsonProperty("show_chain_name_en")
        private String showChainNameEn;

        private int hasWithdrawMemo;

        private String withdrawPercent;

        private String withdrawFix;

        public String getChain() {
            return chain;
        }

        public void setChain(String chain) {
            this.chain = chain;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getFullCurrType() {
            return fullCurrType;
        }

        public void setFullCurrType(String fullCurrType) {
            this.fullCurrType = fullCurrType;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getExplorerUrl() {
            return explorerUrl;
        }

        public void setExplorerUrl(String explorerUrl) {
            this.explorerUrl = explorerUrl;
        }

        public String getShowChainNameEn() {
            return showChainNameEn;
        }

        public void setShowChainNameEn(String showChainNameEn) {
            this.showChainNameEn = showChainNameEn;
        }

        public int getHasWithdrawMemo() {
            return hasWithdrawMemo;
        }

        public void setHasWithdrawMemo(int hasWithdrawMemo) {
            this.hasWithdrawMemo = hasWithdrawMemo;
        }

        public String getWithdrawPercent() {
            return withdrawPercent;
        }

        public void setWithdrawPercent(String withdrawPercent) {
            this.withdrawPercent = withdrawPercent;
        }

        public String getWithdrawFix() {
            return withdrawFix;
        }

        public void setWithdrawFix(String withdrawFix) {
            this.withdrawFix = withdrawFix;
        }
    }

}
