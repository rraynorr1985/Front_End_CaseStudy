package com.springdatajpa.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springdatajpa.boot.entities.Address;
import com.springdatajpa.boot.entities.Doctor;
import com.springdatajpa.boot.repository.AddressRepository;
import com.springdatajpa.boot.repository.DoctorsRepository;
//Service class for implementing Spring pre-built method for CRUD functionality
@Service
public class DoctorsService {
	//Calling Repo for pre-built method access
   @Autowired DoctorsRepository drepo;
   	//Calling Repo for pre-built method access
   @Autowired AddressRepository arepo;  
   
   //Transactional for persisting to Database | Save
   @Transactional
   public void save(Doctor doctor) {
	   drepo.save(doctor);
   }
   //Transactional for persisting to Database | Save address
   @Transactional
   public void saveadd(Address address) {
	   arepo.save(address);
   }
   //List all doctors
   public List<Doctor> listAll()
   {
	 return (List<Doctor>) drepo.findAll();
   }
   //Get Doctor by ID
   public Doctor get(Integer id) 
   {
	  return drepo.findById(id).get();
   }
   //Transactional for persisting to Database | Update address
   @Transactional
   public void update(Doctor doctor) {
	   Doctor docFound = drepo.findById(doctor.getDocid()).get();
	   docFound.setFirstname(doctor.getFirstname());
	   docFound.setLastname(doctor.getLastname());
	   docFound.setEmail(doctor.getEmail());
	   docFound.setPhoneNumber(doctor.getPhoneNumber());
	   docFound.setNpi(doctor.getNpi());
	   docFound.setEducation(doctor.getEducation());
	   docFound.setSpecialization(doctor.getSpecialization());
	   docFound.setGender(doctor.getGender());
   }
   //Transactional for persisting to Database | Bounding Adress with Doctor
   @Transactional
   public void addAddress(Integer id, Address add) {
	   Address aFound = arepo.findById(add.getId()).get();
	   Doctor docFound = drepo.findById(id).get();
	   docFound.setAddress(aFound);
   }
   //Transactional for persisting to Database | Doctor deletion
   @Transactional
   public void delete(Integer id ) {
	   drepo.deleteById(id);
   }
}
