package com.practice.spring.jpa.learnjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.spring.jpa.learnjpa.entity.User;
import com.practice.spring.jpa.learnjpa.service.UserDaoService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

	@Autowired
	private UserDaoService userDaoService;

	@Override
	public void run(String... args) throws Exception {
		log.info("User inserted to database with id : " + userDaoService.insert(new User("Jack", "Admin")));
	}

}
