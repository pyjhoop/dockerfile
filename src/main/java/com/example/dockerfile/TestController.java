package com.example.dockerfile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api")
    public String test() {
        return "Hello World! I'm yeon jun";
    }

    @GetMapping("/test")
    public String test2() {
        return "Hello World! I'm yeon jun";
    }
}
