/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @Description 链上交易信息
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class ChainTransactionInfo {

    @JsonProperty("done_amount")
    private String doneAmount;

    @JsonProperty("done_amount_total")
    private String doneAmountTotal;

    @JsonProperty("confirming_list")
    private ConfirmItem[] confirmingList;

    @JsonProperty("done_tx_item_list")
    private TxItem[] doneTxItemList;

    @JsonProperty("confirming_tx_item_list")
    private TxItem[] confirmingTxItemList;


    public String getDoneAmount() {
        return doneAmount;
    }

    public void setDoneAmount(String doneAmount) {
        this.doneAmount = doneAmount;
    }

    public String getDoneAmountTotal() {
        return doneAmountTotal;
    }

    public void setDoneAmountTotal(String doneAmountTotal) {
        this.doneAmountTotal = doneAmountTotal;
    }

    public ConfirmItem[] getConfirmingList() {
        return confirmingList;
    }

    public void setConfirmingList(ConfirmItem[] confirmingList) {
        this.confirmingList = confirmingList;
    }

    public TxItem[] getDoneTxItemList() {
        return doneTxItemList;
    }

    public void setDoneTxItemList(TxItem[] doneTxItemList) {
        this.doneTxItemList = doneTxItemList;
    }

    public TxItem[] getConfirmingTxItemList() {
        return confirmingTxItemList;
    }

    public void setConfirmingTxItemList(TxItem[] confirmingTxItemList) {
        this.confirmingTxItemList = confirmingTxItemList;
    }

}
