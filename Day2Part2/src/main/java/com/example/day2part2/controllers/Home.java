package com.example.day2part2.controllers;

import com.example.day2part2.models.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student=new StudentModel(1,"Mayur Sharma","email@123");
        return student;
    }
}
