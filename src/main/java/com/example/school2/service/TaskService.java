package com.example.school2.service;

import java.util.List;

import com.example.school2.model.Task;

public interface TaskService {
   
  public List<Task> getTasks();
  
  public Task addTask(Task task);
  public Task deleteTask(String id);
  public Task updateTask(String id, Task task);
}
