package com.minhaempresa.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.minhaempresa.course.entities.User;
import com.minhaempresa.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{ //eh executado quando a aplicacao eh iniciada

	//dependencia de objetos
	@Autowired
	private UserRepository userRepository;

@Override
public void run(String... args) throws Exception {

	//na base de dados  id eh autoincrement pelo que não eh preciso informar
	User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
	User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
	
	userRepository.saveAll(Arrays.asList(u1, u2));
}
}
