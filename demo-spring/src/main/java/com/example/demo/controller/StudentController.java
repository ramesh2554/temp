package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.IntSequenceGenerator;

@RestController
public class StudentController {

	 @Autowired
	 StudentService service;
	
	
	
	@GetMapping("allStudents")
	public List<Student> getAllStudents(){
		
		
		return service.getAllStudents();
	}
	
	@PostMapping("add")
	public Integer addStudent(@RequestBody Student student){
		
		Integer id = service.saveStudent(student);
		System.out.println(id);
		return id;
	}
	
	
}
