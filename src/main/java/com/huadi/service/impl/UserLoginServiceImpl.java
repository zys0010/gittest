package com.huadi.service.impl;

import com.huadi.mapper.UserMapper;
import com.huadi.pojo.User;
import com.huadi.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserMapper userMapper;

    public User getLoginUser(User user) {
        System.out.println("UserService//"+user);


        return userMapper.getLoginUser(user);
    }

    public int registerUser(User user) {

        return userMapper.registerUser(user);
    }


    /**
     * 获得数据库列表
     * @return
     */
    public List<User> getUsers(){
        return userMapper.getUsers();
    }
}
