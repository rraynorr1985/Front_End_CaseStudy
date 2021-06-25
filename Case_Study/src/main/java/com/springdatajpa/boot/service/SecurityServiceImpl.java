package com.springdatajpa.boot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

//Class for Spring Security implementation SecurityService Interface implementation

@Service
public class SecurityServiceImpl implements SecurityService {
	//authenticationManager - to be able to grant Authorities as User or Admin
	@Autowired
	private AuthenticationManager authenticationManager;
	
	//userDetailsService for authentication implementation
	@Autowired
	private UserDetailsService userDetailsService;
	
	//Contant for logging what happening into LoggerFactory
	private static final Logger logger = LoggerFactory.getLogger(SecurityServiceImpl.class);
	
	//Overriding findLoggedInUsername method to be able to find user with passed credentials
	@Override
	public String findLoggedInUsername() {
		Object userDetails = SecurityContextHolder.getContext().getAuthentication().getDetails();
		if(userDetails instanceof UserDetails)
		{
			return ((UserDetails)userDetails).getUsername();
		}
			return null;
		}
	//For auto login
	@Override
	public void autologin(String username, String password) {
		UserDetails userDetails = userDetailsService.loadUserByUsername(username);
		UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
		
		authenticationManager.authenticate(usernamePasswordAuthenticationToken);
		
		if(usernamePasswordAuthenticationToken.isAuthenticated()) {
			SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			logger.debug(String.format("Auto login %s sucessfully!", username));
		}
		
	}

}
