package com.atguigu.securitydemo1.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @RequestMapping("/index")
    public String index() {
        return "hello index";
    }

    @PreAuthorize("hasAnyAuthority('admin')") //进入方法前进行验证权限
//  @Secured({"ROLE_sale","ROLE_manager"})    //验证角色
    @RequestMapping("/update")
    public String update() {
        return "hello update";
    }
}
