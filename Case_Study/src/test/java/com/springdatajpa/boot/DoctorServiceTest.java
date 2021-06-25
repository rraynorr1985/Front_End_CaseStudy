package com.springdatajpa.boot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.annotation.Rollback;


import com.springdatajpa.boot.entities.Address;
import com.springdatajpa.boot.entities.Doctor;

import com.springdatajpa.boot.repository.DoctorsRepository;
import com.springdatajpa.boot.service.DoctorsService;

//Class for testing DoctorService methods
@SpringBootTest
//For persisting to TestDatabase(not in production)
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
@Rollback(false)
//For Testing Method Ordering
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DoctorServiceTest {
	
	static Integer testId;
	//DoctorsService instance
	@Autowired
	private DoctorsService dService;
	
	@Autowired
	private DoctorsRepository drepo;
	
	//Save Method test
	@Test
	@Order(1)
	void testSaveDoctor() {
		Doctor doctor = new Doctor("test name","test lname",1234567,"test@email.com",1234567890L,new Address("12345","Test state","test City","test street","22","1"),"male","edu","test spec",null);
		dService.save(doctor);
		testId=doctor.getDocid();
		System.out.println(doctor.getDocid());
		assertNotNull(dService.get(testId));
	}
	//Save Address Test
	@Test
	@Order(2)
	void testSaveAddress() {
		Address address = new Address("12345","Test state","test City","test street","22","1");
		dService.saveadd(address);
		assertNotNull(address.getId());
	}
	//Find Doctor by ID Test
	@Test
	@Order(3)
	void findByID() {
		Doctor expected = new Doctor("test fname","test lname", 1234567,"test2@email.com",1234567890L,new Address("12345","Test state","test City","test street","22","1"),"male","test edu","test spec",null);
		dService.save(expected);
		Doctor actual = dService.get(expected.getDocid());
		assertEquals(expected, actual);		
	}
	
	//Testing Delete method
	@Test
	@Order(4)
	void deleteById() {
		Doctor doctor2 = new Doctor("test fname","test lname", 1234567,"test2@email.com",1234567890L,new Address("12345","Test state","test City","test street","22","1"),"male","test edu","test spec",null);
		dService.save(doctor2);
		//Checking if we created new object
		assertNotNull(doctor2.getDocid());
		//Delete new just created object
		dService.delete(doctor2.getDocid());
		//Checking if it's present in DB
		try {doctor2.getDocid();}
		//Catching SQL exception which going to be thrown If object is not presented
		catch(EmptyResultDataAccessException e)
		{
			assertTrue(true);
		}
	}
	//Update method test
	@Test
	@Order(5)
	void updateDoctor() {
		//Creating Doctor Entity for updation and persisting it to DB
		Doctor doctorForUpd = dService.get(testId);
		doctorForUpd.setFirstname("updated fname");
		drepo.save(doctorForUpd);
		//Creating different values for updation
		 assertThat(doctorForUpd.getFirstname()).isEqualTo("updated fname");
	}
	//Rendering list of Doctors Test
	@Test
	@Order(6)
	void listDoctors() {
			List<Doctor> doctors = dService.listAll();
			Doctor doctor = dService.get(testId);
			assertTrue(doctors.contains(doctor));					
	}

}
