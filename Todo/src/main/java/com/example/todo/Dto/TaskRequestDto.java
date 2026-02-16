package com.example.todo.Dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskRequestDto {
    @NotBlank(message="Name can not be blank")
    private String name;

    @Min(value=1, message="Deadline can not be lessa than 1")
    private int deadline;
}
