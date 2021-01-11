package com.huadi.dao;

import com.huadi.pojo.User;

import javax.jws.soap.SOAPBinding;

public class UserDao {
    public User getLoginUser(User user){
        System.out.println("get实现了存储"+user);
        return user;
    }

    public void registerUser(User user){
        System.out.println("register"+user);
    }

    public void saveUser(User user){
        System.out.println("save实现了存储"+user);
    }
}
