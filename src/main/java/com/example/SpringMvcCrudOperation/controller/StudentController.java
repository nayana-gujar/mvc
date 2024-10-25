package com.example.SpringMvcCrudOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringMvcCrudOperation.model.Student;
import com.example.SpringMvcCrudOperation.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/welcomePage")
	public String preReg() {
		
		return "welcome";
		
	}
	
	@GetMapping("/saveStu")
	public ModelAndView saveStu(Student stu) {
		System.out.println(stu);
		Student saveStu=studentService.saveStu(stu);
		ModelAndView mav = new ModelAndView();
		mav.addObject("STU", saveStu);
		mav.setViewName("success");
		
		return mav ;
		
	}
	
	@GetMapping("/students")
	public ModelAndView getAllStudent(){
		 List<Student> allStudent=studentService.getAllStudent();
		 ModelAndView mav = new ModelAndView();
			mav.addObject("ALLSTU", allStudent);
			mav.setViewName("students");
			
			return mav ;
	}
	
	@GetMapping("/deleteAll")
	public String deleteAllRecords(){
		studentService.deleteAllRecords();
		return "deleteAll";
	}
}
