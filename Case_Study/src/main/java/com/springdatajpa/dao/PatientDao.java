package com.springdatajpa.dao;

import java.util.ArrayList;
import java.util.List;

import com.springdatajpa.dbconnection.DbConnection;
import com.springdatajpa.entities.Patient;

public class PatientDao extends DbConnection implements PatientDaoI {

	@Override
	public boolean addPatient(Patient pat) {
		try {
			this.connect();
			em.getTransaction().begin();
			em.persist(pat);
			em.getTransaction().commit();
			this.disconnect();
			return true;
		}
		catch(Exception e) { e.printStackTrace(); }
		return false;
	}

	@Override
	public Patient getPatient(Integer id) {
		try {
			this.connect();
			Patient fpat =em.find(Patient.class, id);
			this.disconnect();
			return fpat;
		}catch(Exception e) {e.printStackTrace();}
		return null;
	}

	@Override
	public Patient updatePatient(Patient pat) {
		try {
			this.connect();
			em.getTransaction().begin();
			Patient fpat = em.find(Patient.class, pat.getId());
			fpat.setFirstname(pat.getFirstname());
			fpat.setLastname(pat.getLastname());
			fpat.setInsuranceNumber(pat.getInsuranceNumber());
			fpat.setInsurance(pat.getInsurance());
			fpat.setEmail(pat.getEmail());
			fpat.setActive(pat.isActive());
			fpat.setDob(pat.getDob());
			fpat.setGender(pat.getGender());
			fpat.setAddress(pat.getAddress());
			fpat.setPhone(pat.getPhone());
			fpat.setEmergencyPhone(pat.getEmergencyPhone());
			fpat.setFileslink(pat.getFileslink());
			fpat.setUser(pat.getUser());
			em.getTransaction().commit();
			this.disconnect();
			return fpat;
		}catch(Exception e) {e.printStackTrace();}
		return null;
	}

	@Override
	public Patient removePatient(Integer id) {
		try {
			this.connect();
			em.getTransaction().begin();
			Patient fpat = em.find(Patient.class, id);
			em.remove(fpat);
			em.getTransaction().commit();
			this.disconnect();
			return fpat;
		}
		catch(Exception e) {e.printStackTrace();}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> getAllPatients() {
		List<Patient> res = new ArrayList<>();
		try {
			this.connect();
			res=em.createQuery("select p from Patient p").getResultList();
			return res;
		}catch(Exception e) {e.printStackTrace();}
		return null;
	}

	}


