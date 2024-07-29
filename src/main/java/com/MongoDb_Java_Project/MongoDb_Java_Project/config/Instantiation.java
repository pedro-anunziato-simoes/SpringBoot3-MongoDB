package com.MongoDb_Java_Project.MongoDb_Java_Project.config;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.MongoDb_Java_Project.MongoDb_Java_Project.domain.Post;
import com.MongoDb_Java_Project.MongoDb_Java_Project.domain.User;
import com.MongoDb_Java_Project.MongoDb_Java_Project.repository.PostRepository;
import com.MongoDb_Java_Project.MongoDb_Java_Project.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userReposiroty;

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userReposiroty.deleteAll();
		postRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null,"Bob Grey", "bob@gmail.com");
		
		
		Post post1 = new Post(null, new Date(29/07/2024),"Partiu Viagem!","Vou viajar para São Paulo",maria);
		Post post2 = new Post(null, new Date(29/07/2024),"Bom dia!","Acordei feliz hoje!",maria);
		
		
		userReposiroty.saveAll(Arrays.asList(maria, alex, bob));
		postRepository.saveAll(Arrays.asList(post1,post2));
	}

}
