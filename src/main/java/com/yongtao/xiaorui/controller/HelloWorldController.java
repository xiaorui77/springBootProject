package com.yongtao.xiaorui.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController
{

    @ResponseBody
    @RequestMapping("helloWorld")
    public String helloWorld() {
        return "Hello world!";
    }
}
