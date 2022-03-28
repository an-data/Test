package com.config;

import com.bean.TestB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @Date 2022/3/17 13:46
 * @Created by yangmx
 */
@Configuration
@Lazy
public class APPConfig {
    @Bean
    TestB getTestB() {
        return new TestB();
    }
}
