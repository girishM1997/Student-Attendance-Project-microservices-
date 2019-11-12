package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="GmLoginUser")
@Data
public class User {

	@Id
	private long userId;
	private String passWord;
	private String userType;
}
