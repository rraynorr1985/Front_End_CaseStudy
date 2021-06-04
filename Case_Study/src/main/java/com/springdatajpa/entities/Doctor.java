package com.springdatajpa.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Doctor")
@Table(name = "doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer docid;
	private String firstname;
	private String lastname;
	private Integer npi;
	private boolean isActive;
	private Date regdate;
	private String email;
	private Integer phoneNumber;
	private String imglink;
	@OneToOne
	private Address address; 
	private String gender;
	private String education;
	private String specialization;
	@OneToMany
	private List<Insurance> insurance;
	@OneToOne
	private User user;
	
	private Date created;
	private Date modified;
	
	
	public Doctor() {}
	
	public Doctor(String firstname, String lastname, Integer npi, boolean isActive, Date regdate,
			String email, Integer phoneNumber, String imglink, Address address, String gender, String education,
			String specialization, List<Insurance> insurance, User user, Date created, Date modified) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.npi = npi;
		this.isActive = isActive;
		this.regdate = regdate;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.imglink = imglink;
		this.address = address;
		this.gender = gender;
		this.education = education;
		this.specialization = specialization;
		this.insurance = insurance;
		this.user = user;
		this.created = created;
		this.modified = modified;
	}
	
	
	public Integer getDocid() {
		return docid;
	}
	public void setDocid(Integer docid) {
		this.docid = docid;
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
	public Integer getNpi() {
		return npi;
	}
	public void setNpi(Integer npi) {
		this.npi = npi;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getImglink() {
		return imglink;
	}
	public void setImglink(String imglink) {
		this.imglink = imglink;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public List<Insurance> getInsurance() {
		return insurance;
	}
	public void setInsurance(List<Insurance> insurance) {
		this.insurance = insurance;
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
		if(!(o instanceof Doctor)) return false;
		return docid !=null && docid.equals(((Doctor) o).getDocid());
	}
	
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
