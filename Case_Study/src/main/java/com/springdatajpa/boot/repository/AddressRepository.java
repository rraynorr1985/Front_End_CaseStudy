package com.springdatajpa.boot.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import com.springdatajpa.boot.entities.Address;

//Pre built Spring Repo for implementing CRUD functionality
@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

}
