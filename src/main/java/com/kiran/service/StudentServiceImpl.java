package com.kiran.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiran.Dto.LoginAuth;
import com.kiran.Dto.StudentAuth;
import com.kiran.entity.Student;
import com.kiran.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepo repo;
	

	@Override
	public Student registerStudent(StudentAuth studentauth) {
		    Student std=new Student();
		    std.setMailid(studentauth.getMailid());
		    std.setMobilenumber(studentauth.getMobilenumber());
		    std.setName(studentauth.getName());
		    std.setPassword(studentauth.getPassword());
		   Student stud= repo.save(std);
		   System.out.println(stud);
		return stud;
	}

	@Override
	public boolean loginStd(LoginAuth login) {
		System.out.println(login.getMailid());
		    Optional<Student> std=repo.findByMailid(login.getMailid());
		
		    if(!std.isEmpty()) {
		    	System.out.println("found");
		    	return true;
		    }
		    return false;
		   
		    
	}

}
