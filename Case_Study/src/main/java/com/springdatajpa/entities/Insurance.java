package com.springdatajpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Insurance {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer insid;
	private String insurName;
	private Integer insPhone;
	private String insWebLink;
	
	
	
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
	public Integer getInsPhone() {
		return insPhone;
	}
	public void setInsPhone(Integer insPhone) {
		this.insPhone = insPhone;
	}
	public String getInsWebLink() {
		return insWebLink;
	}
	public void setInsWebLink(String insWebLink) {
		this.insWebLink = insWebLink;
	}
	
	
	
}
