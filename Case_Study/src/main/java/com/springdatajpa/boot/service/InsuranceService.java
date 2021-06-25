package com.springdatajpa.boot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdatajpa.boot.entities.Address;
import com.springdatajpa.boot.entities.Doctor;
import com.springdatajpa.boot.entities.Insurance;
import com.springdatajpa.boot.repository.DoctorsRepository;
import com.springdatajpa.boot.repository.InsuranceRepository;
//Service class for implementing Spring pre-built method for CRUD functionality
@Service
public class InsuranceService {
	//Calling Repo for pre-built method access
	@Autowired DoctorsRepository dRepo;
	//Calling Repo for pre-built method access
	@Autowired InsuranceRepository iRepo;
	
	 //Get Insurance by ID
	   public Insurance get(Integer id) 
	   {
		  return iRepo.findById(id).get();
	   }
	
	//Transactional for persisting to Database | Save
	@Transactional
	public void save(Insurance ins) {
		iRepo.save(ins);
	}
	 //List all Insurances
	public List<Insurance> listAllIns(){
		return (List<Insurance>) iRepo.findAll();
	}
	//Transactional for persisting to Database | Save Insurance to Doctor
	@Transactional
	public void save(Integer insid, Integer docid)
	{
		Doctor doc = dRepo.findById(docid).get();
		Insurance ins = iRepo.findById(insid).get();
		doc.getInsurance().add(ins);
	}
	//Insurance info update
	   @Transactional
	   public void updateIns(Insurance ins) {
		   Insurance insFound = iRepo.findById(ins.getInsid()).get();
		   insFound.setInsPhone(ins.getInsPhone());
		   insFound.setInsurName(ins.getInsurName());
		   insFound.setInsWebLink(ins.getInsWebLink());
	   }
	
	
	//Transactional for persisting to Database | Delete
	@Transactional
	public void delete(Integer insid)
	{
		iRepo.deleteById(insid);
	}

}
