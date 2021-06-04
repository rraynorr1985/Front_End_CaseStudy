package com.springdatajpa.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String zipcode;
	private String stateName;
	private String citiName;
	private String streetName;
	private String houseNumber;
	private String aptNumber;
	
	public Address() {};
	
	public Address(Integer id, String zipcode, String stateName, String citiName, String street, String houseNumber,
			String aptNumber) {
		super();
		this.id = id;
		this.zipcode = zipcode;
		this.stateName = stateName;
		this.citiName = citiName;
		this.streetName = street;
		this.houseNumber = houseNumber;
		this.aptNumber = aptNumber;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCitiName() {
		return citiName;
	}
	public void setCitiName(String citiName) {
		this.citiName = citiName;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String street) {
		this.streetName = street;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getAptNumber() {
		return aptNumber;
	}
	public void setAptNumber(String aptNumber) {
		this.aptNumber = aptNumber;
	}
	
	
}
