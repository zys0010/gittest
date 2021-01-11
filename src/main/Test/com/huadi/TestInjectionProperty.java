package com.huadi;


import com.huadi.impl.UserBizlmpl;
import com.huadi.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)

public class TestInjectionProperty {
    @Autowired
    private BeanFactory beanFactory;

    @Test
    public void testUser(){
        User user=beanFactory.getBean("user",User.class);//获取容器中User对象
        UserBizlmpl userBiz=beanFactory.getBean("userBizlmpl",UserBizlmpl.class);
        userBiz.saveUser(user);
    }

}
