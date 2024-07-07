package com.app.springdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Value("${msg}")
    private String msg;
        @RequestMapping("/hello")
        public String sayHello() {
            return msg;
        }
}
