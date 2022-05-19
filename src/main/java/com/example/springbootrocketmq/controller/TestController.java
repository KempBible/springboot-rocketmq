package com.example.springbootrocketmq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//https://blog.csdn.net/qq_43631716/article/details/119902582
@RestController
public class TestController {

    @GetMapping("/hi")
    public void test(){
        System.out.println(123);
    }
}
