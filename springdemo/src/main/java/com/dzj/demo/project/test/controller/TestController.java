package com.dzj.demo.project.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaojie
 * @Description 测试控制器
 * @createTime 2021-02-01 13:15
 **/
@Controller
@RequestMapping("test")
public class TestController {
    private static final String PREFIX = "test";
    @GetMapping()
    public String test(){
        return PREFIX+"/test";
    }
}
