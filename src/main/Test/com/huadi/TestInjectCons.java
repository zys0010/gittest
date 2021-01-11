package com.huadi;


import com.huadi.impl.UserBizImpl2;
import com.huadi.impl.UserBizlmpl;
import com.huadi.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext2.xml")
@RunWith(SpringJUnit4ClassRunner.class)

public class TestInjectCons {
    @Autowired
    private BeanFactory beanFactory;


    @Test
    public void testUser(){
        User user=new User();
        user.setUser_id(12);
        user.setUser_name("hahahaha");
        user.setUser_age(22);
        UserBizImpl2 userBiz=beanFactory.getBean("userBizImpl2", UserBizImpl2.class);
        userBiz.saveUser(user);
    }






}
