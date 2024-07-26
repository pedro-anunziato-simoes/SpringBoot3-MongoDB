package com.MongoDb_Java_Project.MongoDb_Java_Project.resouces;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MongoDb_Java_Project.MongoDb_Java_Project.domain.User;
import com.MongoDb_Java_Project.MongoDb_Java_Project.dto.UserDTO;
import com.MongoDb_Java_Project.MongoDb_Java_Project.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> list = service.findAll();
		List<UserDTO> listDto = list.stream().map(x-> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
}
