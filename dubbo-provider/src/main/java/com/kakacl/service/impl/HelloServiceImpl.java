package com.kakacl.service.impl;

import com.kakacl.service.HelloService;


public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "你好："+name;
    }
}
