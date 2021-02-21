package com.dzj.demo.project.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author xiaojie
 * @Description 测试控制器
 * @createTime 2021-02-21 23:49
 **/
@Controller
@RequestMapping("/test")
public class TestController {
    private static String PREFIX = "test";

    /**
     * [示例首页]
     * @author xiaojie
     * @return [返回值]
     * @date 2021/2/22 0:11
     */
    @GetMapping()
    public String view() {
        return PREFIX + "/index";
    }

    @GetMapping("/test1")
    public String test1(){
        return PREFIX+"/test1";
    }



    @ResponseBody
    @RequestMapping(value = "/test1message", produces = "text/event-stream;charset=UTF-8")
    public String test6() {
        return "retry:5000\ndata:" + new Date().toLocaleString() + "\n\n";
    }
}
