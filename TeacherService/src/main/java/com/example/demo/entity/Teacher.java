package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="GmTeachers")
@Data
public class Teacher {
	
	@Id
	private long teacherId;
	private String teacherName;
	

}
