package com.springdatajpa.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springdatajpa.boot.entities.Role;


//Pre built Spring Repo for implementing CRUD functionality
public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Role findRoleByName(String name);
	
}
