package com.example.SpringMvcCrudOperation.service;

import java.util.List;

import com.example.SpringMvcCrudOperation.model.Student;

public interface StudentService {

	public Student saveStu(Student stu);
	
	public List<Student> getAllStudent();
	
	public void deleteAllRecords();
}
