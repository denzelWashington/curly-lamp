package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Environment env;

    @GetMapping("/hello")
    public String hello() {
        String pod = env.getProperty("POD_NAME", "unknown");
        return "Hello le nom du pod est " + pod;
    }

    @GetMapping("/wait")
    public String waitTest() throws InterruptedException {
        Thread.sleep(3000);
        return "done test";
    }
}

