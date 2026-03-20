package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello MVC";
    }

    @GetMapping("/wait")
    public String waitTest() throws InterruptedException {
        Thread.sleep(3000);
        return "done MVC";
    }
}

