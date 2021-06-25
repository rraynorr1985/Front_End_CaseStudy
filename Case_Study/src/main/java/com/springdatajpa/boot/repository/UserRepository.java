package com.springdatajpa.boot.repository;


import org.springframework.data.jpa.repository.JpaRepository;

//Pre built Spring Repo for implementing CRUD functionality
import com.springdatajpa.boot.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);
	


}
