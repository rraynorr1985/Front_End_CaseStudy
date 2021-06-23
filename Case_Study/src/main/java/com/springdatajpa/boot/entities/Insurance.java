package com.springdatajpa.boot.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
//Class for creating Insurance entity with table creation in the DB using JPA
@Entity
public class Insurance {
	//Id Generating automatically
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer insid;
	@NotEmpty
	private String insurName;
	@NotNull(message = "This field is required.")
	@DecimalMin(message = "Must be 10 digits long", value = "1000000000")
	@DecimalMax(message = "Must be 10 digits long", value = "9999999999")
	private Long insPhone;
	private String insWebLink;
	
	//ManyTomany relationship implementation
	@ManyToMany(cascade = CascadeType.DETACH)
	@JoinTable(name = "doctor_insurance")
	private List<Doctor> doctor;
	//getters and setters
	public Integer getInsid() {
		return insid;
	}
	public void setInsid(Integer insid) {
		this.insid = insid;
	}
	public String getInsurName() {
		return insurName;
	}
	public void setInsurName(String insurName) {
		this.insurName = insurName;
	}
	public Long getInsPhone() {
		return insPhone;
	}
	public void setInsPhone(Long insPhone) {
		this.insPhone = insPhone;
	}
	public String getInsWebLink() {
		return insWebLink;
	}
	public void setInsWebLink(String insWebLink) {
		this.insWebLink = insWebLink;
	}
	
	
	
}
