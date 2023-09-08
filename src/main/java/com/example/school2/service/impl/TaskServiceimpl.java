package com.example.school2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school2.model.Task;
import com.example.school2.repository.TaskRepository;
import com.example.school2.service.TaskService;

@Service
public class TaskServiceimpl implements TaskService {

	@Autowired
	private TaskRepository taskRepo;
	@Override
	public List<Task> getTasks() {
		// TODO Auto-generated method stub
		return taskRepo.findAll();
	}

	@Override
	public Task addTask(Task task) {
		// TODO Auto-generated method stub
		return taskRepo.save(task);
	}

	@Override
	public Task deleteTask(String id) {
		// TODO Auto-generated method stub
		Task task = taskRepo.findById(id).get();
		taskRepo.delete(task);
		return task;
	}

	@Override
	public Task updateTask(String id, Task task) {
		// TODO Auto-generated method stub
          return null;     		
	}
	
}

























































































