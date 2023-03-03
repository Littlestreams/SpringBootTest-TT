package com.no4.virpay.enums;

import com.no4.virpay.interfaces.StateCode;

/**
 * @author lvqi
 * @Title: 用户信息返回结果
 * @Package
 * @Description:
 * @date 2023/3/3 10:37
 */
public enum UserResultVoCode implements StateCode {
    /**
     * 校验用户id
     */
    VERIFICATION_01("U401","用户id不存在");

    /**
     * 返回码
     */
    private final String code;
    /**
     * 返回值
     */
    private final String msg;


    UserResultVoCode(String code,String msg) {
        this.code = code;
        this.msg = msg;
    }
    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
