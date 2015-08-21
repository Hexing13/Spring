package com.hx.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
/**
 * Created by hexing on 15-8-21.
 */
//@Aspect
@Component("log")
public class Log {

//    @Pointcut("execution(public * com.hx.service..*.add(..))")
    public void myMethod() {};

//    @Before("myMethod()")
    public void before(){
        System.out.println("before method!");
    }

//    @AfterReturning("myMethod()")
    public void afterReturning(){
        System.out.println("after method!");
    }
}
