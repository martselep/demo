package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloName(String name) {
        return "Hello" + name;
    }
}
