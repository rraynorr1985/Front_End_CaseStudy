package com.springdatajpa.boot.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Patient")
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer patid;
	private String firstname;
	private String lastname;
	private String insuranceNumber;
	private String email;
	private boolean isActive;
	private Date dob;
	private String gender;
	@OneToOne
	private Address address;
	private Integer phone;
	private Integer emergencyPhone;
	@OneToOne
	private Insurance insurance;
	private String fileslink;
	@OneToOne
	private User user;
	
	private Date created;
	private Date modified;
	
	public Patient() {}
	
	public Patient(Integer id)
	{
		this.patid=id;
	}
	
	public Patient( String firstname, String lastname, String insuranceNumber, String email,
			boolean isActive, Date dob, String gender, Address address, Integer phone, Integer emergencyPhone,
			Insurance insurance, String fileslink, User user, Date created, Date modified) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.insuranceNumber = insuranceNumber;
		this.email = email;
		this.isActive = isActive;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.emergencyPhone = emergencyPhone;
		this.insurance = insurance;
		this.fileslink = fileslink;
		this.user = user;
		this.created = created;
		this.modified = modified;
	}
	
	
	public Integer getPatid() {
		return patid;
	}

	public void setPatid(Integer patid) {
		this.patid = patid;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public Integer getEmergencyPhone() {
		return emergencyPhone;
	}
	public void setEmergencyPhone(Integer emergencyPhone) {
		this.emergencyPhone = emergencyPhone;
	}
	public Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	public String getFileslink() {
		return fileslink;
	}
	public void setFileslink(String fileslink) {
		this.fileslink = fileslink;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Patient patient = (Patient) o;
		return Objects.equals(patid, patient.patid);
	}
	@Override
	public int hashCode() {
		return Objects.hash(patid);
	}
	
}
