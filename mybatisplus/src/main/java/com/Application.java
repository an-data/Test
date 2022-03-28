package com;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Date 2022/3/11 14:51
 * @Created by yangmx
 */
@SpringBootApplication
public class Application {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
