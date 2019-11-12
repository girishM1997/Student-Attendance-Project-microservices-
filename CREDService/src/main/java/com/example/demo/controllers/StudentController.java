package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping(path="/student",produces = "application/json",consumes = "application/json")
	public Student addStudent(@RequestBody Student student) {
		return this.service.add(student);
	}
	@GetMapping(path="/students",produces = "application/json")
	public List<Student> findAll(){
		return this.service.findAll();
	}
	@GetMapping(path="/student/{rollNumber}",produces = "application/json")
	public Student findById(@PathVariable("rollNumber")long rollNumber) {
		Optional<Student> response=this.service.findById(rollNumber);
		
		Student found=null;
		if(response.isPresent()) {
			found=response.get();
		}
		return found;
	}

	

	
}
