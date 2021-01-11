package com.huadi.impl;

import com.huadi.dao.UserDao;
import com.huadi.pojo.User;

public class UserBizImpl3 {

    private UserDao userDao;

/*
    构造器注入
 */
    public UserBizImpl3(UserDao userDao){
        this.userDao=userDao;
    }

    public void saveUser(){
        User user=new User();
        user.setUser_id(12);
        user.setUser_name("cangcang");
        user.setUser_age(22);
        userDao.saveUser(user);
    }




}
