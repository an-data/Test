package com;

import org.apache.catalina.core.ApplicationFilterFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Lazy;

import java.awt.*;
import java.io.RandomAccessFile;
import java.util.logging.Filter;

/**
 * @Date 2022/3/14 11:27
 * @Created by yangmx
 */
@SpringBootApplication
@ServletComponentScan
public class Application {
//   BeanPostProcessor
//    ApplicationFilterFactory
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
