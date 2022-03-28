package com.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

/**
 * @Date 2022/3/22 8:42
 * @Created by yangmx
 */
@Aspect
@Configuration
public class AopConfig {

    @Before(value = "execution (* out*(..))")
    public void before(JoinPoint joinPoint) {
    }
}
