package com.practice.spring.jpa.learnjpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.spring.jpa.learnjpa.entity.User;
import com.practice.spring.jpa.learnjpa.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		final User jack = new User("Jack", "Admin");
		final User jill = new User("Jill", "Admin");

		final User savedUser = userRepository.save(jack);
		log.info("User inserted to database : " + savedUser);

		final User savedUserJill = userRepository.save(jill);
		log.info("User inserted to database : " + savedUserJill);

		final Optional<User> findByIdOne = userRepository.findById(1L);
		log.info("User retrieved : " + findByIdOne);

		final List<User> users = userRepository.findAll();
		log.info("All users : " + users);
	}

}
