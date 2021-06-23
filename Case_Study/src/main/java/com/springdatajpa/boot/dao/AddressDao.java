package com.springdatajpa.boot.dao;

import java.util.ArrayList;
import java.util.List;

import com.springdatajpa.boot.dbconnection.DbConnection;
import com.springdatajpa.boot.entities.Address;

public class AddressDao extends DbConnection implements AddressDaoI {

	@Override
	public boolean addAddress(Address addr) {
		try {
			this.connect();
			em.getTransaction().begin();
			em.persist(addr);
			em.getTransaction().commit();
			this.disconnect();
			return true;
			}
		catch(Exception e) {e.printStackTrace();}
		return false;
	}

	@Override
	public Address getAddress(int id) {
		try {
			this.connect();
			Address addr = em.find(Address.class, id);
			this.disconnect();
			return addr;
		}
		catch(Exception e) {e.printStackTrace();}
		return null;
	}

	@Override
	public Address updateAddress(Address addr) {
		try {
			this.connect();
			em.getTransaction().begin();
			Address foundedAddr = em.find(Address.class, addr.getId());
			foundedAddr.setZipcode(addr.getZipcode());
			foundedAddr.setCitiName(addr.getCitiName());
			foundedAddr.setStateName(addr.getStateName());
			foundedAddr.setStreetName(addr.getStreetName());
			foundedAddr.setHouseNumber(addr.getHouseNumber());
			foundedAddr.setAptNumber(addr.getAptNumber());
			em.getTransaction().commit();
			this.disconnect();
			return foundedAddr;
		} catch(Exception e) {e.printStackTrace();}
		return null;
	}

	@Override
	public Address removeAddress(Address addr) {
		try {
			this.connect();
			em.getTransaction().begin();
		Address foundAdr = em.find(Address.class, addr.getId());
			em.remove(foundAdr);
			em.getTransaction().commit();
			this.disconnect();
			return foundAdr;
		}
		catch(Exception e) {e.printStackTrace();}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Address> getAllAddresses() {
		List<Address> res = new ArrayList<>();
		try {
			this.connect();
			res = em.createQuery("select a from Adress a").getResultList();
			return res;
		}catch(Exception e) {e.printStackTrace();}
			return null;
	}

}
