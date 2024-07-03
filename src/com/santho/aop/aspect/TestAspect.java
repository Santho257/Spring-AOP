package com.santho.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAspect {
    @Before(value = "execution(public void getAdmin())")
    public void before() {
        System.out.println("Called before Admin");
    }
}
