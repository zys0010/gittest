package com.huadi.mapper;

import com.huadi.pojo.User;

import java.util.List;

public interface UserMapper {

    public User getLoginUser(User user);//验证登录

    public int registerUser(User user);//注册

    public  int deleteById(int user_id);


    public List<User> getUsers();
}
