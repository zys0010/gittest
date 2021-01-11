package com.huadi.service;

import com.huadi.pojo.User;

import java.util.List;

public interface UserLoginService {


    public User getLoginUser(User user);  //用户登录

    public int registerUser(User user);  //用户注册

    public List<User> getUsers();
}
