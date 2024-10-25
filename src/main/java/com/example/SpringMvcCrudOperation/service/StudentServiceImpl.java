package com.example.SpringMvcCrudOperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringMvcCrudOperation.model.Student;
import com.example.SpringMvcCrudOperation.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	public StudentRepository studentRepository;
	
	
	public Student saveStu(Student stu) {
		Student student=studentRepository.save(stu);
		return student;
		
	}


	@Override
	public List<Student> getAllStudent() {
		List<Student> all=(List<Student>) studentRepository.findAll();
		return all;
	}


	@Override
	public void deleteAllRecords() {
		
		studentRepository.deleteAll();
	}
}
