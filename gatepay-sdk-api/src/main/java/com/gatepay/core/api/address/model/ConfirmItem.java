/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.address.model;

import java.math.BigDecimal;


/**
 * @description 确认项
 * @author zj-be
 * @date 2025/07/25
 */
public class ConfirmItem {

    private BigDecimal amount;
    private int confirm;


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getConfirm() {
        return confirm;
    }

    public void setConfirm(int confirm) {
        this.confirm = confirm;
    }

}
