package com.app.springdemo.rest;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
        @RequestMapping("/hello")
        public String sayHello() {
            return "Hello World!";
        }
}
