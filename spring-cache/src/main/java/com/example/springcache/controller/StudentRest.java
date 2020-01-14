package com.example.springcache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcache.Entity.Student;
import com.example.springcache.service.StudentService;

@RestController
public class StudentRest {

	@Autowired
	private StudentService studentService;

	@GetMapping("/student/{id}")
	public Student findStudentById(@PathVariable int id) {
		System.out.println("Searching by ID  : " + id);
		return studentService.getStudentByID(id);
	}

	@DeleteMapping("/student")
	public void cleanCache() {
		studentService.cleanCache();
	}

}
