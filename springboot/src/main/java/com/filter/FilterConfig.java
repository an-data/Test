package com.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.Collection;

//@Configuration
public class FilterConfig {

    @Resource
    private MyTestFilter myTestFilter;

    @Bean
    public FilterRegistrationBean test1FilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(myTestFilter);
        registration.addUrlPatterns("/filter/1");
        registration.setName("testFilter");
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public FilterRegistrationBean test2FilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(myTestFilter);
        registration.addUrlPatterns("/filter/*/2");
        registration.setName("testFilter");
        registration.setOrder(1);
        return registration;
    }
}