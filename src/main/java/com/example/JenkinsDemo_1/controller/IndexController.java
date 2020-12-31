package com.example.JenkinsDemo_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String helloWorld(){
        return  "尝试部署到远程服务器。";
    }
}