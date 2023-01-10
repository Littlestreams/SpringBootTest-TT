package com.no4.virpay.interfaces;

/**
 * @author lvqi
 * @Title: 状态码
 * @Package
 * @Description:
 * @date 2023/1/3 15:46
 */
public interface StateCode {
    /**
     * 获取状态编码
     * @return
     */
    String getCode();
    /**
     * 获取状态码描述
     * @return
     */
    String  getMsg();
}
