package com.gatepay.common.enums;

/**
 * @Description 返回码
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public enum Code {

    SUCCESS("000000", "成功"),
    FAIL("400000", "失败");

    private String code;
    private String desc;

    Code(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
