package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;


public interface StudentService {

	Integer saveStudent(Student student);
	List<Student> getAllStudents();
}
