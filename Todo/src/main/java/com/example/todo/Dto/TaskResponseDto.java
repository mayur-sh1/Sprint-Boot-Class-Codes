package com.example.todo.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class TaskResponseDto {

    private String id;
    private String name;
    private int deadline;


}
