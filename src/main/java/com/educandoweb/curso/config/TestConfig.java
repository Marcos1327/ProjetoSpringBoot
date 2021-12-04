package com.educandoweb.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Marcos", "marcos@gmail.com", "9999999", "108134");
		User u2 = new User(null, "Giovanna", "Alex@gmail.com", "97777662", "55214");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
