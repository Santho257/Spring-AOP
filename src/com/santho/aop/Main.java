package com.santho.aop;

import com.santho.aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("Aop.xml");
        UserService us = app.getBean("userService", UserService.class);
        System.out.println(us.getAdmin().getId()+"-->"+us.getAdmin().getPassword());
    }
}