package com.practice.spring.jpa.learnjpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.spring.jpa.learnjpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
