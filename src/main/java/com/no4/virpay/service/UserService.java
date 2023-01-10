package com.no4.virpay.service;

import com.no4.virpay.dao.model.User;
import com.no4.virpay.dao.model.UserExample;

import java.util.List;

/**
 * @author lvqi
 * @Title:
 * @Package
 * @Description:
 * @date 2022/10/20 15:25
 */
public interface UserService {
    /**
     * 获取所有用户信息
     * @return userExample
     */
    List<User> getAllUserInfo(UserExample userExample);

    /**
     * 插入用户信息
     * @param user
     * @return
     */
    void insertUser(User user);
}
