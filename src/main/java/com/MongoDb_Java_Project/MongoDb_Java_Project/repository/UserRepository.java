package com.MongoDb_Java_Project.MongoDb_Java_Project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.MongoDb_Java_Project.MongoDb_Java_Project.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
