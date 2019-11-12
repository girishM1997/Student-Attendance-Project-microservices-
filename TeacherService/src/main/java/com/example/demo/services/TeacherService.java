package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.repos.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository repo;
	
	public Teacher add(Teacher teacher) {
		return this.repo.save(teacher);
	}
	
	public List<Teacher> findAll(){
		return this.repo.findAll();
	}
	
	public Optional<Teacher> findById(long id) {
		return this.repo.findById(id);
	}
}
