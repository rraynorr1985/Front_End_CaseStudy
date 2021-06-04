package com.springdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springdatajpa.entities.Doctor;
import com.springdatajpa.repository.DoctorsRepository;

@Service
public class DoctorsService {
   @Autowired DoctorsRepository drepo;
   
   @Transactional
   public void save(Doctor doctor) {
	   drepo.save(doctor);
   }
   
   public List<Doctor> listAll()
   {
	 List<Doctor> res =  (List<Doctor>) drepo.findAll();
	 return res;
   }
   
   public Doctor get(Integer id) 
   {
	  return drepo.findById(id).get();
   }
   
   @Transactional
   public void delete(Integer id ) {
	   drepo.deleteById(id);
   }
}
