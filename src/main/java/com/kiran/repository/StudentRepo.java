package com.kiran.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiran.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
	
	Optional<Student> findByMailid(String mailid);

}
