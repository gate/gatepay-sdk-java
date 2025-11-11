/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.withdraw.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

/**
 * @Description 查询状态响应
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class QueryStatusResp extends BaseResponse<QueryStatusResp[]> {

    private String currency;
    private String name;

    @JsonProperty("name_cn")
    private String nameCn;

    private String deposit;

    @JsonProperty("withdraw_percent")
    private String withdrawPercent;

    @JsonProperty("withdraw_fix")
    private String withdrawFix;

    @JsonProperty("withdraw_day_limit")
    private String withdrawDayLimit;

    @JsonProperty("withdraw_day_limit_remain")
    private String withdrawDayLimitRemain;

    @JsonProperty("withdraw_amount_mini")
    private String withdrawAmountMini;

    @JsonProperty("withdraw_eachtime_limit")
    private String withdrawEachtimeLimit;

    @JsonProperty("withdraw_fix_on_chains")
    private WithdrawFixOnChains withdrawFixOnChains;

    @JsonProperty("withdraw_percent_on_chains")
    private WithdrawPercentOnChains withdrawPercentOnChains;



    public static class WithdrawFixOnChains {
        @JsonProperty("ALGO")
        private String ALGO;

        @JsonProperty("APT")
        private String APT;

        @JsonProperty("ARBEVM")
        private String ARBEVM;

        @JsonProperty("AVAX_C")
        private String AVAX_C;

        @JsonProperty("BSC")
        private String BSC;

        @JsonProperty("CELO")
        private String CELO;

        @JsonProperty("DOTSM")
        private String DOTSM;

        @JsonProperty("EOS")
        private String EOS;

        @JsonProperty("ETH")
        private String ETH;

        @JsonProperty("GTEVM")
        private String GTEVM;

        @JsonProperty("KAIA")
        private String KAIA;

        @JsonProperty("KAVAEVM")
        private String KAVAEVM;

        @JsonProperty("MATIC")
        private String MATIC;

        @JsonProperty("NEAR")
        private String NEAR;

        @JsonProperty("OPETH")
        private String OPETH;

        @JsonProperty("SOL")
        private String SOL;

        @JsonProperty("TON")
        private String TON;

        @JsonProperty("TRX")
        private String TRX;

        @JsonProperty("XPL")
        private String XPL;

        @JsonProperty("XTZ")
        private String XTZ;


        public String getALGO() {
            return ALGO;
        }

        public void setALGO(String ALGO) {
            this.ALGO = ALGO;
        }

        public String getAPT() {
            return APT;
        }

        public void setAPT(String APT) {
            this.APT = APT;
        }

        public String getARBEVM() {
            return ARBEVM;
        }

        public void setARBEVM(String ARBEVM) {
            this.ARBEVM = ARBEVM;
        }

        public String getAVAX_C() {
            return AVAX_C;
        }

        public void setAVAX_C(String AVAX_C) {
            this.AVAX_C = AVAX_C;
        }

        public String getBSC() {
            return BSC;
        }

        public void setBSC(String BSC) {
            this.BSC = BSC;
        }

        public String getCELO() {
            return CELO;
        }

        public void setCELO(String CELO) {
            this.CELO = CELO;
        }

        public String getDOTSM() {
            return DOTSM;
        }

        public void setDOTSM(String DOTSM) {
            this.DOTSM = DOTSM;
        }

        public String getEOS() {
            return EOS;
        }

        public void setEOS(String EOS) {
            this.EOS = EOS;
        }

        public String getETH() {
            return ETH;
        }

        public void setETH(String ETH) {
            this.ETH = ETH;
        }

        public String getGTEVM() {
            return GTEVM;
        }

        public void setGTEVM(String GTEVM) {
            this.GTEVM = GTEVM;
        }

        public String getKAIA() {
            return KAIA;
        }

        public void setKAIA(String KAIA) {
            this.KAIA = KAIA;
        }

        public String getKAVAEVM() {
            return KAVAEVM;
        }

        public void setKAVAEVM(String KAVAEVM) {
            this.KAVAEVM = KAVAEVM;
        }

        public String getMATIC() {
            return MATIC;
        }

        public void setMATIC(String MATIC) {
            this.MATIC = MATIC;
        }

        public String getNEAR() {
            return NEAR;
        }

        public void setNEAR(String NEAR) {
            this.NEAR = NEAR;
        }

        public String getOPETH() {
            return OPETH;
        }

        public void setOPETH(String OPETH) {
            this.OPETH = OPETH;
        }

        public String getSOL() {
            return SOL;
        }

        public void setSOL(String SOL) {
            this.SOL = SOL;
        }

        public String getTON() {
            return TON;
        }

        public void setTON(String TON) {
            this.TON = TON;
        }

        public String getTRX() {
            return TRX;
        }

        public void setTRX(String TRX) {
            this.TRX = TRX;
        }

        public String getXPL() {
            return XPL;
        }

        public void setXPL(String XPL) {
            this.XPL = XPL;
        }

        public String getXTZ() {
            return XTZ;
        }

        public void setXTZ(String XTZ) {
            this.XTZ = XTZ;
        }
    }


    public static class WithdrawPercentOnChains {

        @JsonProperty("ALGO")
        private String ALGO;

        @JsonProperty("APT")
        private String APT;

        @JsonProperty("ARBEVM")
        private String ARBEVM;

        @JsonProperty("AVAX_C")
        private String AVAX_C;

        @JsonProperty("BSC")
        private String BSC;

        @JsonProperty("CELO")
        private String CELO;

        @JsonProperty("DOTSM")
        private String DOTSM;

        @JsonProperty("EOS")
        private String EOS;

        @JsonProperty("ETH")
        private String ETH;

        @JsonProperty("GTEVM")
        private String GTEVM;

        @JsonProperty("KAIA")
        private String KAIA;

        @JsonProperty("KAVAEVM")
        private String KAVAEVM;

        @JsonProperty("MATIC")
        private String MATIC;

        @JsonProperty("NEAR")
        private String NEAR;

        @JsonProperty("OPETH")
        private String OPETH;

        @JsonProperty("SOL")
        private String SOL;

        @JsonProperty("TON")
        private String TON;

        @JsonProperty("TRX")
        private String TRX;

        @JsonProperty("XPL")
        private String XPL;

        @JsonProperty("XTZ")
        private String XTZ;


        public String getALGO() {
            return ALGO;
        }

        public void setALGO(String ALGO) {
            this.ALGO = ALGO;
        }

        public String getAPT() {
            return APT;
        }

        public void setAPT(String APT) {
            this.APT = APT;
        }

        public String getARBEVM() {
            return ARBEVM;
        }

        public void setARBEVM(String ARBEVM) {
            this.ARBEVM = ARBEVM;
        }

        public String getAVAX_C() {
            return AVAX_C;
        }

        public void setAVAX_C(String AVAX_C) {
            this.AVAX_C = AVAX_C;
        }

        public String getBSC() {
            return BSC;
        }

        public void setBSC(String BSC) {
            this.BSC = BSC;
        }

        public String getCELO() {
            return CELO;
        }

        public void setCELO(String CELO) {
            this.CELO = CELO;
        }

        public String getDOTSM() {
            return DOTSM;
        }

        public void setDOTSM(String DOTSM) {
            this.DOTSM = DOTSM;
        }

        public String getEOS() {
            return EOS;
        }

        public void setEOS(String EOS) {
            this.EOS = EOS;
        }

        public String getETH() {
            return ETH;
        }

        public void setETH(String ETH) {
            this.ETH = ETH;
        }

        public String getGTEVM() {
            return GTEVM;
        }

        public void setGTEVM(String GTEVM) {
            this.GTEVM = GTEVM;
        }

        public String getKAIA() {
            return KAIA;
        }

        public void setKAIA(String KAIA) {
            this.KAIA = KAIA;
        }

        public String getKAVAEVM() {
            return KAVAEVM;
        }

        public void setKAVAEVM(String KAVAEVM) {
            this.KAVAEVM = KAVAEVM;
        }

        public String getMATIC() {
            return MATIC;
        }

        public void setMATIC(String MATIC) {
            this.MATIC = MATIC;
        }

        public String getNEAR() {
            return NEAR;
        }

        public void setNEAR(String NEAR) {
            this.NEAR = NEAR;
        }

        public String getOPETH() {
            return OPETH;
        }

        public void setOPETH(String OPETH) {
            this.OPETH = OPETH;
        }

        public String getSOL() {
            return SOL;
        }

        public void setSOL(String SOL) {
            this.SOL = SOL;
        }

        public String getTON() {
            return TON;
        }

        public void setTON(String TON) {
            this.TON = TON;
        }

        public String getTRX() {
            return TRX;
        }

        public void setTRX(String TRX) {
            this.TRX = TRX;
        }

        public String getXPL() {
            return XPL;
        }

        public void setXPL(String XPL) {
            this.XPL = XPL;
        }

        public String getXTZ() {
            return XTZ;
        }

        public void setXTZ(String XTZ) {
            this.XTZ = XTZ;
        }
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
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

    public String getWithdrawDayLimit() {
        return withdrawDayLimit;
    }

    public void setWithdrawDayLimit(String withdrawDayLimit) {
        this.withdrawDayLimit = withdrawDayLimit;
    }

    public String getWithdrawDayLimitRemain() {
        return withdrawDayLimitRemain;
    }

    public void setWithdrawDayLimitRemain(String withdrawDayLimitRemain) {
        this.withdrawDayLimitRemain = withdrawDayLimitRemain;
    }

    public String getWithdrawAmountMini() {
        return withdrawAmountMini;
    }

    public void setWithdrawAmountMini(String withdrawAmountMini) {
        this.withdrawAmountMini = withdrawAmountMini;
    }

    public String getWithdrawEachtimeLimit() {
        return withdrawEachtimeLimit;
    }

    public void setWithdrawEachtimeLimit(String withdrawEachtimeLimit) {
        this.withdrawEachtimeLimit = withdrawEachtimeLimit;
    }

    public WithdrawFixOnChains getWithdrawFixOnChains() {
        return withdrawFixOnChains;
    }

    public void setWithdrawFixOnChains(WithdrawFixOnChains withdrawFixOnChains) {
        this.withdrawFixOnChains = withdrawFixOnChains;
    }

    public WithdrawPercentOnChains getWithdrawPercentOnChains() {
        return withdrawPercentOnChains;
    }

    public void setWithdrawPercentOnChains(WithdrawPercentOnChains withdrawPercentOnChains) {
        this.withdrawPercentOnChains = withdrawPercentOnChains;
    }

}
