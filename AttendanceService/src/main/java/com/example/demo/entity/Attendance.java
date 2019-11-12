package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="GmAttendance")
@Data
public class Attendance {

	@Id
	private long attendanceId;
	private long rollNumber;
	//private LocalDate absentDate;
	private int day;
	private int month;
	private int year;
}
