package com.no4.virpay.dao.dto;

import com.alibaba.excel.annotation.ExcelProperty;

import java.util.Date;

/**
 * @author lvqi
 * @Title:
 * @Package
 * @Description:
 * @date 2023/1/6 16:41
 */
public class ComplexHeadDataDTO {
    @ExcelProperty({"主标题", "字符串标题"})
    private String string;
    @ExcelProperty({"主标题", "日期标题"})
    private Date date;
    @ExcelProperty({"主标题","数字标题"})
    private Double doubleData;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getDoubleData() {
        return doubleData;
    }

    public void setDoubleData(Double doubleData) {
        this.doubleData = doubleData;
    }

    @Override
    public String toString() {
        return "ComplexHeadDataDTO{" +
                "string='" + string + '\'' +
                ", date=" + date +
                ", doubleData=" + doubleData +
                '}';
    }
}
