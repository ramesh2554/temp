package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	StudentRepo studentrepo ;

	public Integer saveStudent(Student student) {
		Student saveStudentInfo = studentrepo.save(student);
		return saveStudentInfo.getId();
	}

	public List<Student> getAllStudents() {
		return studentrepo.findAll();
	}
	
}
