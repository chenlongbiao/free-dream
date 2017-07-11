package com.freedream.service.impl;

import com.freedream.dao.UserMapper;
import com.freedream.domain.User;
import com.freedream.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 陈龙飚 on 2017/7/11 0011.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectUserByName(String name) {
        return userMapper.selectUserByName(name);
    }

    @Override
    public String signUp(User user) throws Exception {
        String success=userMapper.signUp(user).toString();
        return success;
    }
}
