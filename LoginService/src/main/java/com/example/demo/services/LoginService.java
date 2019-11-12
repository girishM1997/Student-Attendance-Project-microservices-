package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repos.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository repo;
	
	public User add(User user) {
		return this.repo.save(user);
	}
	public List<User> findAll() {
		return this.repo.findAll();
	}
	public Optional<User> findById(long id) {
		return this.repo.findById(id);
	}
//	public void deleteById(long id) {
//		this.repo.deleteById(id);
//	}

}
