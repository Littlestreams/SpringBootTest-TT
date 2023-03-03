package com.no4.virpay.controller;

import com.no4.virpay.base.ResultVo;
import com.no4.virpay.dao.model.User;
import com.no4.virpay.enums.UserResultVoCode;
import com.no4.virpay.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author lvqi
 * @Title: 模拟用户登录，测试session共享问题
 * @Package
 * @Description:
 * @date 2023/2/27 16:19
 */
@Controller
@RequestMapping(value = "/login")
public class UserLoginController {
    @Resource
    private UserService userService;
    /**
     * 用户登录
     * @return
     */
    @RequestMapping(value = "/userLogin")
    @ResponseBody
    public ResultVo userLogin(HttpServletRequest request, HttpServletResponse response, @RequestParam String userId){
        User user = userService.selectByPrimaryKey(userId);
        HttpSession session = request.getSession();
        session.setAttribute("userId",user.getId());
        return  ResultVo.success();
    }
}
