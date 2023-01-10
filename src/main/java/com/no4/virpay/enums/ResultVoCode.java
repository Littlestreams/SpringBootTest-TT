package com.no4.virpay.enums;

import com.no4.virpay.interfaces.StateCode;

/**
 * @author lvqi
 * @Title: 请求返回结果
 * @Package
 * @Description:
 * @date 2023/1/3 15:53
 */
public enum ResultVoCode implements StateCode {

    /**
     * 请求成功
     */
    SUCCESS("Q200","成功"),
    /**
     * 请求失败
     */
     FAILED("F201","失败"),
    /**
     * 参数校验失败
     */
    VALIDATE("V1002", "参数校验失败");

    /**
     * 返回码
     */
    private final String code;
    /**
     * 返回值
     */
    private final String Msg;


    ResultVoCode(String code,String msg) {
        this.code = code;
        Msg = msg;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.Msg;
    }
}
