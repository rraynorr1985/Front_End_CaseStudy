package com.springdatajpa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.springdatajpa.dbconnection.DbConnection;
import com.springdatajpa.entities.Doctor;

public class DoctorDao extends DbConnection implements DoctorDaoI {

	@Override
	public boolean addDoctor(Doctor doc) {
		try {
			this.connect();
			em.getTransaction().begin();
			em.persist(doc);
			em.getTransaction().commit();
			this.disconnect();
			return true;
		}
		catch(Exception e) {e.printStackTrace();};
		return false;
	}

	@Override
	public Doctor getDoc(int id) {
		try {this.connect();
		Doctor doc = em.find(Doctor.class, id);
		this.disconnect();
		return doc;
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		return null;
	}

	@Override
	public Doctor updateDoc(Doctor doc) {
		try {
		this.connect();
		em.getTransaction().begin();
		Doctor foundedDoc = em.find(Doctor.class, doc.getId());
		foundedDoc.setFirstname(doc.getFirstname());
		foundedDoc.setLastname(doc.getLastname());
		foundedDoc.setNpi(doc.getNpi());
		foundedDoc.setActive(doc.isActive());
		foundedDoc.setEmail(doc.getEmail());
		foundedDoc.setPhoneNumber(doc.getPhoneNumber());
		foundedDoc.setImglink(doc.getImglink());
		foundedDoc.setAddress(doc.getAddress());
		foundedDoc.setEducation(doc.getEducation());
		foundedDoc.setSpecialization(doc.getSpecialization());
		foundedDoc.setInsurance(doc.getInsurance());
		foundedDoc.setUser(doc.getUser());
		foundedDoc.setModified(doc.getModified());
		em.getTransaction().commit();
		this.disconnect();
		return foundedDoc;
		}
		catch(Exception e) {e.printStackTrace();}
	
		return null;
	}

	@Override
	public Doctor removeDoc(int id) {
		try {
		this.connect();
		em.getTransaction().begin();
		Doctor f = em.find(Doctor.class, id);
		em.remove(f);
		em.getTransaction().commit();
		this.disconnect();
		return f;
		} catch(Exception e) {e.printStackTrace();};
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> res = new ArrayList<>();
		try {
			this.connect();
			Query qr = em.createQuery("Select d from Doctor d");
			res = qr.getResultList();
		}catch(Exception e){e.printStackTrace();}
		
		return res;
	}

}
