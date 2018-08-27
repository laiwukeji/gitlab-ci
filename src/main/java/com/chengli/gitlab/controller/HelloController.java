package com.chengli.gitlab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.chengli.gitlab.service.HelloService;

/**
 * @Author: chengli
 * @Date: 2018/8/1 14:39
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return helloService.hello();
    }

    @RequestMapping("/")
    public String success(){
        return "success";
    }
}
