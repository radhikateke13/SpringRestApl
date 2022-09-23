package com.example.demo.withDatabse;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	List<Student> findBysname(String sname);
		
}
