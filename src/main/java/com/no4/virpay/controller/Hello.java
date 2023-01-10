package com.no4.virpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lvqi
 * @Title:
 * @Package
 * @Description:
 * @date 2022/10/2 20:15
 */
@Controller
@RequestMapping("/h1")
public class Hello {
    @RequestMapping("/hi")
    public String sayHi(){
        return "hello";
    }
}
