package com.springdatajpa.boot.service;


import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springdatajpa.boot.entities.Role;
import com.springdatajpa.boot.entities.User;
import com.springdatajpa.boot.repository.RoleRepository;
import com.springdatajpa.boot.repository.UserRepository;
import com.springdatajpa.boot.utilities.UtilitContants;


//Actual implementation UserService Interface for Spring Security impl
@Service
public class UserServiceImpl implements UserService {
	
	
	//for user
	@Autowired
	private UserRepository userRepository;
	//for role
	@Autowired
	private RoleRepository roleRepository;
	//for encrypting(security DB storing)
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	//Saving Roles to DB
	@Override
	public void saveRoles() {
		List<Role> list = roleRepository.findAll();
		Role role = new Role();
		role.setName(UtilitContants.ADMINROLE);
		Role role2 = new Role();
		role2.setName(UtilitContants.USERROLE);
		if(!list.contains(role))
		{
			roleRepository.save(role);
		}
		if(!list.contains(role2))
		{
			roleRepository.save(role2);
		}
		}
		
	//Saving user to DB
	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		User admin = null;
		try {
			admin = userRepository.findById(1).get(); 
		}
		catch(NoSuchElementException e)
		{
			user.setRoles(new HashSet<>(roleRepository.findAll()));
		}
		if(admin != null)
		 {
			Set<Role> setUserRole = new HashSet<>();
			setUserRole.add(roleRepository.findRoleByName(UtilitContants.USERROLE));
			user.setRoles(setUserRole);
		}
		
		userRepository.save(user);
	}
	//Searching User from DB
	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
