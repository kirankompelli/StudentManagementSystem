package com.kiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiran.Dto.LoginAuth;
import com.kiran.Dto.StudentAuth;
import com.kiran.Dto.StudentResponse;
import com.kiran.entity.Student;
import com.kiran.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentService service;

	@PostMapping("/register")
	public Student studentRegister(@RequestBody StudentAuth studentauth)
	{
		  return  service.registerStudent(studentauth);
		       
		       
	}
	
	@PostMapping("login")
	public String loginStudent(@RequestBody LoginAuth loginauth) {
		if(service.loginStd(loginauth)) {
			return "user Found";
		}
		return "user not found";
	}
	
	
}
