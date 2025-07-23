package com.kiran.service;

import com.kiran.Dto.LoginAuth;
import com.kiran.Dto.StudentAuth;
import com.kiran.entity.Student;

public interface StudentService {
	
	public Student registerStudent(StudentAuth studentauth);
	
	public boolean loginStd(LoginAuth login);

}
