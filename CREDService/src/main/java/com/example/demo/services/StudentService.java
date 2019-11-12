package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Student;
import com.example.demo.repos.StudentRepository;;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public Student add(Student student) {
		return this.repo.save(student);
	}
	public List<Student> findAll() {
		return this.repo.findAll();
	}
	public Optional<Student> findById(long id) {
		return this.repo.findById(id);
	}

	

}
