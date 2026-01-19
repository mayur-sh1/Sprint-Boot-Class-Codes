package com.example.day1revision;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String sayHello(){
        return "Hello !, This is my first line";
    }
    @GetMapping("/second")
    public String dusraRoute(){
        return "This is my second route.";
    }
    @GetMapping("/third")
    public String thirdRoute(){
        return "This is my third route.";
    }
}
