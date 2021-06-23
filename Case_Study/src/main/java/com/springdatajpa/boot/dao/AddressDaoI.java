package com.springdatajpa.boot.dao;

import java.util.List;

import com.springdatajpa.boot.entities.Address;

public interface AddressDaoI {
	public boolean addAddress(Address addr);
	public Address getAddress(int id);
	public Address updateAddress(Address addr);
	public Address removeAddress(Address addr);
	public List<Address> getAllAddresses();
}
