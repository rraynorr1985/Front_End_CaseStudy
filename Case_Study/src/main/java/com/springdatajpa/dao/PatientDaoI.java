package com.springdatajpa.dao;

import java.util.List;

import com.springdatajpa.entities.Patient;

public interface PatientDaoI {
	public boolean addPatient(Patient pat);
	public Patient getPatient(Integer id);
	public Patient updatePatient(Patient pat);
	public Patient removePatient(Integer id);
	public List<Patient> getAllPatients();
}
