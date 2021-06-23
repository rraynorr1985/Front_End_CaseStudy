package com.springdatajpa.boot.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
//Class for creating Doctor entity with table creation in the DB using JPA
@Entity
@Table(name = "doctor")
public class Doctor {
	//Id Generating automatically
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer docid;
	//Validation Field can't be Empty
	@NotEmpty
	private String firstname;
	//Validation Field can't be Empty
	@NotEmpty
	private String lastname;
	//Validation
	@NotNull(message = "This field is required.")
	@Min(message = "Must be 7 digits long", value = 1000000)
	@Max(message = "Must be 7 digits long", value = 9999999)
	private Integer npi;
	//Doctor is Active by default
	private boolean isActive=true;
	//Validation
	@NotEmpty
	@Email(message = "Email is not valid(example: \"xx@mail.com\"")
	private String email;
	//Validation
	@NotNull(message = "This field is required.")
	@DecimalMin(message = "Must be 10 digits long", value = "1000000000")
	@DecimalMax(message = "Must be 10 digits long", value = "9999999999")
	private Long phoneNumber;
	//Validation
	@Valid
	//OneToOne relationship implementation
	@OneToOne(cascade=CascadeType.ALL)
	private Address address; 
	private String gender;
	private String education;
	private String specialization;
	//ManyTomany relationship implementation
	@ManyToMany(
			targetEntity=Insurance.class,
			cascade=CascadeType.DETACH,
			fetch = FetchType.LAZY
			)
	//adding 3d table for ManyToMany implementation
	@JoinTable(
			name="doctor_insurance"						
			)
	private List<Insurance> insurance;
	//OneToOne relationship implementation - Doctor is a User
	@OneToOne
	private User user;
	//Automatic DateStamp to track Entity creation
	@CreationTimestamp
	private Date created;
	//Automatic DateStamp to track Entity update
	@UpdateTimestamp
	private Date modified;
	
	//Constructors
	public Doctor() {}
	
	public Doctor(String firstname, String lastname, Integer npi,
			String email, Long phoneNumber,  Address address, String gender, String education,
			String specialization, User user) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.npi = npi;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
		this.education = education;
		this.specialization = specialization;
		this.user = user;
		
	}
	
	//Getters and Setters
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
	public boolean getIsActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	
	//Overriding Equals and HashCode for correct Object comparing, customized,because creationdate and updatedate can't participate
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((docid == null) ? 0 : docid.hashCode());
		result = prime * result + ((education == null) ? 0 : education.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((npi == null) ? 0 : npi.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
		return result;
	}
	//Overriding Equals and HashCode for correct Object comparing,customized,because creationdate and updatedate can't participate
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (docid == null) {
			if (other.docid != null)
				return false;
		} else if (!docid.equals(other.docid))
			return false;
		if (education == null) {
			if (other.education != null)
				return false;
		} else if (!education.equals(other.education))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (npi == null) {
			if (other.npi != null)
				return false;
		} else if (!npi.equals(other.npi))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		
		return true;
	}
	
	
}
