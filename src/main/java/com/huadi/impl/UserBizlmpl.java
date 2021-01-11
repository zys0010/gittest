package com.huadi.impl;

import com.huadi.dao.UserDao;
import com.huadi.pojo.User;

public class UserBizlmpl {

    /*
    属性注入
     */
    private UserDao userDao;
    /*
    set方法需要传递User对象用于注入
     */
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public  void  saveUser(User user){
        userDao.saveUser(user);
    }
}
