package com.huadi.impl;

import com.huadi.dao.UserDao;
import com.huadi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class UserBizImpl2 {

    /*
    @Resourse资源注解
     */
    @Resource(name = "userDao")


//    @Autowired
//    @Qualifier("userDao")
    private UserDao userDao;

    public void saveUser(User user){

        userDao.saveUser(user);


    }
}
