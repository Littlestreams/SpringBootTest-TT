package com.no4.virpay.base;


import com.no4.virpay.enums.ResultVoCode;

/**
 * @author lvqi
 * @Title: 统一返回结果
 * @Package
 * @Description:
 * @date 2023/1/3 15:17
 */

public class ResultVo<T>{
    /**
     * 返回状态码
     */
    private String code;
    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ResultVo<T> success() {
        ResultVo<T> resultVo = new ResultVo<>();
        resultVo.setCode(ResultVoCode.SUCCESS.getCode());
        resultVo.setMessage(ResultVoCode.SUCCESS.getMsg());
        return resultVo;
    }
    public static <T> ResultVo<T> success(T data) {
        ResultVo<T> resultVo = success();
        resultVo.setData(data);
        return resultVo;
    }
    public static <T> ResultVo<T> success(String message,T data) {
        ResultVo<T> resultVo = success();
        resultVo.setMessage(message);
        resultVo.setData(data);
        return resultVo;
    }
    public static <T> ResultVo<T> success(String code,String message,T data) {
        ResultVo<T> resultVo = new ResultVo<>();
        resultVo.setCode(code);
        resultVo.setMessage(message);
        resultVo.setData(data);
        return resultVo;
    }

    public static <T> ResultVo<T> failed() {
        ResultVo<T> resultVo = new ResultVo<>();
        resultVo.setCode(ResultVoCode.FAILED.getCode());
        resultVo.setMessage(ResultVoCode.FAILED.getMsg());
        return resultVo;
    }
    public static <T> ResultVo<T> failed(T data) {
        ResultVo<T> resultVo = failed();
        resultVo.setData(data);
        return resultVo;
    }
    public static <T> ResultVo<T> failed(String message,T data) {
        ResultVo<T> resultVo = failed();
        resultVo.setMessage(message);
        resultVo.setData(data);
        return resultVo;
    }
    public static <T> ResultVo<T> failed(String code,String message,T data) {
        ResultVo<T> resultVo = new ResultVo<>();
        resultVo.setCode(code);
        resultVo.setMessage(message);
        resultVo.setData(data);
        return resultVo;
    }
}
