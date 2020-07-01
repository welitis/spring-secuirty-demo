package com.welisit.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author welisit
 * @Description 演示
 * @create 2020-06-30 22:52
 */
@RestController
public class DemoController {

    @GetMapping
    public String portal() {
        return "欢迎访问首页";
    }

    @GetMapping("info")
    public String getInfo() {
        return "用户信息页";
    }
}
