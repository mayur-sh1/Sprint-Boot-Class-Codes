package com.example.todo.Controller;

import com.example.todo.Dto.TaskRequestDto;
import com.example.todo.Dto.TaskResponseDto;
import com.example.todo.Service.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public TaskResponseDto createTask(@Valid @RequestBody TaskRequestDto request) {
        return taskService.createTask(request);
    }

    @GetMapping
    public List<TaskResponseDto> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public TaskResponseDto getTask(@PathVariable String id) {
        return taskService.getTaskById(id);
    }

    @PutMapping("/{id}")
    public TaskResponseDto updateTask(
            @PathVariable String id,
            @Valid @RequestBody TaskRequestDto request) {
        return taskService.updateTask(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable String id) {
        taskService.deleteTask(id);
        return "Task Deleted Successfully";
    }
}
