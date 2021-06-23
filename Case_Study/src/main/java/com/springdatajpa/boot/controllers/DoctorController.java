package com.springdatajpa.boot.controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springdatajpa.boot.entities.Address;
import com.springdatajpa.boot.entities.Doctor;
import com.springdatajpa.boot.entities.Insurance;
import com.springdatajpa.boot.service.DoctorsService;
import com.springdatajpa.boot.service.InsuranceService;
//Controller for handling Doctor's entity views and Models, for interaction between FrontEnd and BackEnd
@Controller
public class DoctorController {
	//Service for Doctors CRUD functionality using and passing to views
	@Autowired DoctorsService dservice;
	//Service for Insurance CRUD functionality using and passing to views
	@Autowired InsuranceService iservice;
	
	//Handler for Doctor and Insurance Rendering
	@GetMapping("/doctors")
	public ModelAndView displayDoctors() {
		List<Doctor> listDoctors = dservice.listAll();
		List<Insurance> listInsurance = iservice.listAllIns();
		ModelAndView mav = new ModelAndView("doctors");
		mav.addObject("listDoctors",listDoctors);
		mav.addObject("listInsur", listInsurance);
		return mav;
	}
	//Handler for Doctor and Insurance Rendering without buttons for CRUD functionality
	@GetMapping("/doctorsuser")
	public ModelAndView displayDoctorsUser() {
		List<Doctor> listDoctors = dservice.listAll();
		List<Insurance> listInsurance = iservice.listAllIns();
		ModelAndView mav = new ModelAndView("doctors_user");
		mav.addObject("listDoctors",listDoctors);
		mav.addObject("listInsur", listInsurance);
		return mav;
	}
	//Handler for NEW Doctor form rendering
	@RequestMapping(value="/newdoc",method=RequestMethod.GET)
	public String formNewDoc(Map<String, Object> model) {
		Doctor doctor = new Doctor();
		model.put("doctor", doctor);
		return "new_doctor";
	}
	//Handler for field Validation and saving new Doctor entity into DB
	@RequestMapping(value="/savedoc", method=RequestMethod.POST)
	public String saveDoc(@ModelAttribute("doctor") @Valid Doctor doctor, BindingResult errors)
	{
		if(errors.hasErrors())
		{
			return "new_doctor";
		}
		else {	
		dservice.save(doctor);
		dservice.saveadd(doctor.getAddress());
		return "redirect:/doctors";
		}
		
	}
	//Handler for Doctor editing Form rendering
	@RequestMapping(value="/editdoc", method=RequestMethod.GET)
	public ModelAndView editDoctor(@RequestParam Integer id) 
	{
		ModelAndView mav = new ModelAndView("edit_doctor");
		Doctor doctor = dservice.get(id);
		mav.addObject("fdoctor",doctor);
		return mav;
	}
	//Handler for Doctor Editing persisting to DB and redirecting to full Doctors list
	@RequestMapping(value="/editdoc", method=RequestMethod.POST)
	public String editDoc(@ModelAttribute("doctor") Doctor doctor)
	{
		dservice.update(doctor);
		return "redirect:/doctors";
	}
	//Handler for Doctor's deletion from the DB
	@RequestMapping(value="/delete")
	public String deleteDoc(@RequestParam Integer id)
	{
		dservice.delete(id);
		return "redirect:/doctors";
	}
	//Handler for saving Address for specific Doctor	
	@RequestMapping(value="/saveaddress", method=RequestMethod.POST)
	public String saveAddress(@RequestParam Integer id, @ModelAttribute("address") Address address)
	{
		dservice.addAddress(id, address);
		return "redirect:/doctors";
	}
	
	
	
}
