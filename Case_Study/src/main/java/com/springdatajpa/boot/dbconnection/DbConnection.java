package com.springdatajpa.boot.dbconnection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DbConnection {
	protected String prName = "Case_Study";
	protected EntityManagerFactory emf = null;
	protected EntityManager em = null;
	
	public void connect() {
		this.emf = Persistence.createEntityManagerFactory(prName);
		this.em = emf.createEntityManager();
	}
	
	public void disconnect() {
		if(this.emf!=null)
		emf.close();
		if(this.em!=null)
			em.close();
	}
}
