package com.no4.virpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author lvqi
 * @Title: table表格导出到word
 * @Package
 * @Description:
 * @date 2022/10/7 16:08
 */
@Controller
@RequestMapping(value = "d1")
public class DownLoadWord {
    @RequestMapping(value = "word")
    public String downLoadWord(){
        return "downLoadWord";
    }
}
