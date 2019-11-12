package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Attendance;
import com.example.demo.services.AttendanceService;


@RestController
public class AttendanceController {

	@Autowired
	private AttendanceService service;
	
	@PostMapping(path="/attendance",produces = "application/json",consumes = "application/json")
	public Attendance addAttendance(@RequestBody Attendance attendance) {
		return this.service.add(attendance);
	}
	@GetMapping(path="/attendances",produces = "application/json")
	public List<Attendance> findAll(){
		return this.service.findAll();
	}
	@GetMapping(path="/attendance/{attendanceId}",produces = "application/json")
	public Attendance findById(@PathVariable("attendanceId")long attendanceId) {
		Optional<Attendance> response=this.service.findById(attendanceId);
		
		Attendance found=null;
		if(response.isPresent()) {
			found=response.get();
		}
		return found;
	}
	@GetMapping(path="/attendances/{rollNumber}/{month}",produces = "application/json")
	public List<Attendance> findByRollNumberAndMonth(@PathVariable("rollNumber")long rollNumber,@PathVariable("month")int month){
		return this.service.findByRollNumberAndMonth(rollNumber,month);
	}
}
