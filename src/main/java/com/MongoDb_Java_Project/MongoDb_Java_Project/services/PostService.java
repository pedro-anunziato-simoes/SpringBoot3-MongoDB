package com.MongoDb_Java_Project.MongoDb_Java_Project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MongoDb_Java_Project.MongoDb_Java_Project.domain.Post;
import com.MongoDb_Java_Project.MongoDb_Java_Project.repository.PostRepository;
import com.MongoDb_Java_Project.MongoDb_Java_Project.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}
	
	public List<Post> findByTitle(String text){
		return repo.findByTitle(text);
	}

}
