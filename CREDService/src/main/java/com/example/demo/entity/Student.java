package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="gmStudent")
@Data
public class Student {

	@Id
	private long rollNumber;
	private String studentName;
	private LocalDate dateOfBirth;
	private long teacherId;
}
