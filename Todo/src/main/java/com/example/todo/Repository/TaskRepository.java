package com.example.todo.Repository;

import com.example.todo.Model.TaskModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<TaskModel,String> {
    // kaam kregi taskModel k sth and string for id type string hai
}
