package com.dzj.demo.project.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiaojie
 * @Description 首页
 * @createTime 2021-01-31 12:01
 **/
@Controller
public class IndexController {
    @GetMapping("/")
    public String xingxing(){
        return "index/index";
    }

    @GetMapping("/index")
    public String index(){
        return "index/index";
    }
}
