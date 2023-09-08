package com.example.school2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.school2.model.Task;

public interface TaskRepository extends MongoRepository<Task,String>{

}
