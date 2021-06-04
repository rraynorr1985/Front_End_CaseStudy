package com.springdatajpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springdatajpa.entities.Doctor;
import com.springdatajpa.service.DoctorsService;

@Controller
public class HomeController {
	@Autowired DoctorsService dservice;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView displayHomePage() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping(value="/doctors",method=RequestMethod.GET)
	public ModelAndView displayDoctors() {
		List<Doctor> listDoctors = dservice.listAll();
		ModelAndView mav = new ModelAndView("doctors");
		mav.addObject("listDoctors",listDoctors);
		return mav;
	}
	
	@RequestMapping(value="/reg",method=RequestMethod.GET)
	public ModelAndView displayRegistration() {
		ModelAndView mav = new ModelAndView("registration");
		return mav;
	}
	
	@RequestMapping(value="/log",method=RequestMethod.GET)
	public ModelAndView displayRLogin() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
}
