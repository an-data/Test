package com.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Slf4j
public class MyTestFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("[ {} ] 创建啦...", this.getClass().getSimpleName());
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("[ {} ] 执行啦...", this.getClass().getSimpleName());
 
        chain.doFilter(request, response);
    }
 
    @Override
    public void destroy() {
        log.info("[ {} ] 被摧毁啦...", this.getClass().getSimpleName());
    }
}