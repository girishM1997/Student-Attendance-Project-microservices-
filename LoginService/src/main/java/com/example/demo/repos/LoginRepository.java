package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface LoginRepository extends JpaRepository<User, Long> {

}
