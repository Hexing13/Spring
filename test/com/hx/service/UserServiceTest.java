package com.hx.service;

import com.hx.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceTest {

    @Test
    public void testAdd(){
        ApplicationContext factory = new ClassPathXmlApplicationContext("hellomessage.xml");
        UserService userService = (UserService) factory.getBean("userservice");
        User u = new User();
        userService.add(u);

    }
}