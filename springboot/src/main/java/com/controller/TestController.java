package com.controller;

import com.bean.TestB;
import com.dto.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Date 2022/3/21 13:31
 * @Created by yangmx
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestB testB;

    @GetMapping
    public void out(@RequestBody T t) {
        System.out.println(t);
    }
}
