package com.application.greeting.webservice;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello() {
        return "Hello There";
    }
}
