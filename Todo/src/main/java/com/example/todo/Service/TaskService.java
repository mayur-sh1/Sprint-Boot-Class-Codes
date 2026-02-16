package com.example.todo.Service;

import com.example.todo.Dto.TaskRequestDto;
import com.example.todo.Dto.TaskResponseDto;
import com.example.todo.Model.TaskModel;
import com.example.todo.Repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    // CREATE
    public TaskResponseDto createTask(TaskRequestDto request) {

        TaskModel task = new TaskModel();
        task.setName(request.getName());
        task.setDeadline(request.getDeadline());

        TaskModel savedTask = taskRepository.save(task);

        return new TaskResponseDto(
                savedTask.getId(),
                savedTask.getName(),
                savedTask.getDeadline()
        );
    }

    // GET ALL
    public List<TaskResponseDto> getAllTasks() {

        return taskRepository.findAll()
                .stream()
                .map(task -> new TaskResponseDto(
                        task.getId(),
                        task.getName(),
                        task.getDeadline()))
                .collect(Collectors.toList());
    }

    // GET BY ID
    public TaskResponseDto getTaskById(String id) {

        TaskModel task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task Not Found"));

        return new TaskResponseDto(
                task.getId(),
                task.getName(),
                task.getDeadline()
        );
    }

    // UPDATE
    public TaskResponseDto updateTask(String id, TaskRequestDto request) {

        TaskModel task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task Not Found"));

        task.setName(request.getName());
        task.setDeadline(request.getDeadline());

        TaskModel updated = taskRepository.save(task);

        return new TaskResponseDto(
                updated.getId(),
                updated.getName(),
                updated.getDeadline()
        );
    }

    // DELETE
    public void deleteTask(String id) {

        if (!taskRepository.existsById(id)) {
            throw new RuntimeException("Task Not Found");
        }

        taskRepository.deleteById(id);
    }
}
