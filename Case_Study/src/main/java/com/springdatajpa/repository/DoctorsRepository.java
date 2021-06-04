package com.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springdatajpa.entities.Doctor;

@Repository
public interface DoctorsRepository extends CrudRepository<Doctor, Integer> {

}
