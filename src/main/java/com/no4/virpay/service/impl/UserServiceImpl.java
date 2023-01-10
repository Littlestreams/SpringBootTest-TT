package com.no4.virpay.service.impl;

import com.no4.virpay.dao.mapper.UserMapper;
import com.no4.virpay.dao.model.User;
import com.no4.virpay.dao.model.UserExample;
import com.no4.virpay.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lvqi
 * @Title:
 * @Package
 *
 * @Description:
 * @date 2022/10/20 15:27
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getAllUserInfo(UserExample userExample) {
        return userMapper.selectByExample(userExample);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void insertUser(User user) {
        int i = userMapper.insertSelective(user);
    }
}
