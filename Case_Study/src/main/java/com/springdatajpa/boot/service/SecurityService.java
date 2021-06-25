package com.springdatajpa.boot.service;

//Class for Spring Security implementation pre-built Interface for finding User credentials and autologin
public interface SecurityService {
	String findLoggedInUsername();
	
	void autologin(String username,String password);

}
