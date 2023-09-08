package com.example.school2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.school2.model.Task;
import com.example.school2.service.TaskService;

@RestController
@RequestMapping("/api/tasks") 
public class TaskController {
	@Autowired
	private TaskService taskService;
	@GetMapping("/all")
	public List<Task> getTasks(){
		return taskService.getTasks();
	} 
	@PostMapping("/insert")
	public Task insert(@RequestBody Task task) {
		return taskService.addTask(task);
	}
}
