package com.MongoDb_Java_Project.MongoDb_Java_Project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MongoDb_Java_Project.MongoDb_Java_Project.domain.User;
import com.MongoDb_Java_Project.MongoDb_Java_Project.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}
