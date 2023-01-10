package com.no4.virpay.controller;

import com.no4.virpay.dao.model.User;
import com.no4.virpay.dao.model.UserExample;
import com.no4.virpay.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lvqi
 * @Title:
 * @Package
 * @Description:
 * @date 2022/10/20 15:20
 */
@RestController
@RequestMapping(value = "/u")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;

    /**
     * 获取所有用户信息
     * @return
     */
    @RequestMapping(value = "/allUserInfo")
    @ResponseBody
    public List<User> getAllUserInfo(){
        List<User> allUserInfo=null;
        try {
            logger.info("获取所有用户信息...start");
            UserExample ue = new UserExample();
            ue.setOrderByClause("id");
            allUserInfo = userService.getAllUserInfo(ue);
            logger.info("获取所有用户信息...end");
        }catch (Exception e){
            logger.info("获取所有用户信息出现异常",e);
        }
        return allUserInfo;
    }

    /**
     * 获取所有用户信息
     * @return
     */
    @RequestMapping(value = "/insert")
    @ResponseBody
    public String insertUserInfo(){
        User user = null;
        try {
            logger.info("新增用户信息...start");
            user = new User();
            user.setId("003");
            user.setName("Jerry");
            user.setSex(16);
            user.setAddress("洛杉矶");
            userService.insertUser(user);
            logger.info("新增用户信息...end");
        }catch (Exception e){
            logger.info("新增用户信息出现异常",e);
        }
        return user.toString();
    }
}
