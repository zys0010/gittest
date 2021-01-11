package com.huadi;


import com.huadi.pojo.User;
import com.huadi.service.UserLoginService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;


@ContextConfiguration("classpath:applicationContext-Mybatis.xml")//加载spring配置文件，构建spring容器
@RunWith(SpringJUnit4ClassRunner.class)//spring测试注解
public class TestUser {

    @Autowired
    private BeanFactory beanFactory;//spring的bean工厂

    @Test
    public void testUser(){
        UserLoginService userLoginService =beanFactory.getBean("userLoginService",UserLoginService.class);//获取容器中的User对象
        /**
         * 构造迭代器遍历返回的userList
         */
        List<User> userList =userLoginService.getUsers();
        Iterator it = userList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Test
    public void testSessionSelect(){
        SqlSessionFactory sqlSessionFactory= (SqlSessionFactory) beanFactory.getBean("sqlSessionFactory");
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<User> userList2=sqlSession.selectList("com.huadi.mapper.UserMapper.getUsers");
        System.out.println(userList2);

        int i =sqlSession.delete("com.huadi.mapper.UserMapper.deleteById");
        System.out.println(i);
    }
}
