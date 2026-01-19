package com.example.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class Home {
//    @GetMapping("/")
//    public String sayHello(){
//        return "This is running fine ";
//    }
//} this is to return normal string

@Controller
public class Home{
    @GetMapping("/")
    public String hello(){
        return "index";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/contactUs")
    public String contactUs(){
        return "contactUs";
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
