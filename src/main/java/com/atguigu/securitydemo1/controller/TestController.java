package com.atguigu.securitydemo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/add")
    public String add() {
        return "hello security";
    }
}
