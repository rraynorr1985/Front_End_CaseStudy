package com.springdatajpa.boot.dao;

import java.util.List;

import com.springdatajpa.boot.entities.Patient;

public interface PatientDaoI {
	public boolean addPatient(Patient pat);
	public Patient getPatient(Integer id);
	public Patient updatePatient(Patient pat);
	public Patient removePatient(Integer id);
	public List<Patient> getAllPatients();
}
