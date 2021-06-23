package com.springdatajpa.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springdatajpa.boot.entities.Patient;


//Pre built Spring Repo for implementing CRUD functionality Patients implementing still in Progress
@Repository
public interface PatientsRepository extends CrudRepository<Patient, Integer> {
	

}
