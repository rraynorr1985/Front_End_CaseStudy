package com.springdatajpa.boot.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;

//Class for creating Address entity with table creation in the DB using JPA
@Entity
public class Address {
	//Id Generating automatically
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	//Validation
	@NotEmpty
	@DecimalMin(value = "10000",message="must be 5 digits long")
	@DecimalMax(value = "99999",message="must be 5 digits long")
	private String zipcode;
	//Validation
	@NotEmpty
	private String stateName;
	//Validation
	@NotEmpty
	private String citiName;
	//Validation
	@NotEmpty
	private String streetName;
	//Validation
	@NotEmpty
	@DecimalMin(value = "1")
	private String houseNumber;
	private String aptNumber;
	
	
	//Constructors
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
	//Getters and Setters
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
	//Overriding Equals and HashCode for correct Object comparing
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aptNumber == null) ? 0 : aptNumber.hashCode());
		result = prime * result + ((citiName == null) ? 0 : citiName.hashCode());
		result = prime * result + ((houseNumber == null) ? 0 : houseNumber.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((stateName == null) ? 0 : stateName.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (aptNumber == null) {
			if (other.aptNumber != null)
				return false;
		} else if (!aptNumber.equals(other.aptNumber))
			return false;
		if (citiName == null) {
			if (other.citiName != null)
				return false;
		} else if (!citiName.equals(other.citiName))
			return false;
		if (houseNumber == null) {
			if (other.houseNumber != null)
				return false;
		} else if (!houseNumber.equals(other.houseNumber))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (stateName == null) {
			if (other.stateName != null)
				return false;
		} else if (!stateName.equals(other.stateName))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (zipcode == null) {
			if (other.zipcode != null)
				return false;
		} else if (!zipcode.equals(other.zipcode))
			return false;
		return true;
	}
	
	
}
