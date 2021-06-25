package com.springdatajpa.boot.controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springdatajpa.boot.entities.Doctor;
import com.springdatajpa.boot.entities.Insurance;
import com.springdatajpa.boot.service.DoctorsService;
import com.springdatajpa.boot.service.InsuranceService;
//Controller for handling Insurance entity views and Models, for interaction between FrontEnd and BackEnd
@Controller
public class InsuranceController {
	
	//Service for Insurance CRUD functionality using and passing to views
	@Autowired InsuranceService iService;
	//Service for Insurance CRUD functionality using and passing to views
	@Autowired DoctorsService dService;
	
	//Assigning insurance to doctor
	@GetMapping("/assigninsurance")
	public ModelAndView insuranceList(@RequestParam Integer docid)
	{
		List<Insurance> res = iService.listAllIns();
		ModelAndView mav = new ModelAndView("addinsurance");
		Doctor doctor = dService.get(docid);
		mav.addObject("listInsurance",res);
		mav.addObject("doctor", doctor);
		return mav;
	}
	//Rendering new insurance form
	@GetMapping("/newins")
	public String formNewIns(Map<String,Object> model) {
		Insurance ins = new Insurance();
		model.put("insurance", ins);
		return "new_insurance";
	}
	//Handling Validation for new insurance field and persisting new Insurance to DB
	@PostMapping("/saveins")
	public String saveIns(@ModelAttribute("insurance") @Valid Insurance insurance,BindingResult errors)
	{
		if(errors.hasErrors())
		{
			return "new_insurance";
		}
		else {
		iService.save(insurance);
		return "redirect:/listinsurance";
		}
	}
	//Rendering insurance list after saving new_insurance(without assign button)
	@GetMapping("/listinsurance")
	public ModelAndView insuranceList2()
	{
		List<Insurance> res = iService.listAllIns();
		ModelAndView mav = new ModelAndView("listinsurance");
		mav.addObject("listInsurance",res);
		return mav;
	}
	//For assigning Insurance to the Doctor
	@GetMapping("/assignins")
	public String assignInsurance(@RequestParam Integer insid, @RequestParam Integer docid )
	{
		iService.save(insid, docid);
		return "redirect:/doctors";
	}
	//For Deleting Insurance
	@RequestMapping(value="/deleteins")
	public String deleteDoc(@RequestParam Integer insid)
	{
		iService.delete(insid);
		return "redirect:/addinsurance";
	}

}
