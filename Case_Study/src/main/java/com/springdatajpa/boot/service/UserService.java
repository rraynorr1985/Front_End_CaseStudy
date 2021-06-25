package com.springdatajpa.boot.service;

import com.springdatajpa.boot.entities.User;

//Interface for Spring Security prebuilt method implementation
public interface UserService {
	void save(User user);
	
	User findByUsername(String username);
	
	void saveRoles();

}
