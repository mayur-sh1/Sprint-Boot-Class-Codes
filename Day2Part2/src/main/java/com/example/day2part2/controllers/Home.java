package com.example.day2part2.controllers;

import com.example.day2part2.models.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Home {
    @GetMapping("/")
    public List<StudentModel> getStudent(){
        StudentModel student=new StudentModel(1,"Mayur Sharma","email@123");
        StudentModel student2=new StudentModel(2,"A","fghhjkl");
        StudentModel student3=new StudentModel(3,"B","hjsdjsb");
        StudentModel student4=new StudentModel(4,"C","hjsdajhg");

        // this is how u show multiple objects in json fromat
        List<StudentModel> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);


        return students;
    }
}
