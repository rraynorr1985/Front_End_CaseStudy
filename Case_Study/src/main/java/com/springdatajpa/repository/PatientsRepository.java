package com.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springdatajpa.entities.Patient;

@Repository
public interface PatientsRepository extends CrudRepository<Patient, Integer> {
	

}
