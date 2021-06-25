package com.springdatajpa.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springdatajpa.boot.entities.User;
import com.springdatajpa.boot.exception.IncorrectUsernamePasswordException;
import com.springdatajpa.boot.service.SecurityService;
import com.springdatajpa.boot.service.UserService;
import com.springdatajpa.boot.validator.UserValidator;

//Controller for handling Spring Security
@Controller
public class UserController {
	//pre built SS service for SS Implementation
	@Autowired
	private UserService userService;
	//pre built SS service for SS Implementation
	@Autowired
	private SecurityService securityService;
	//Validation for existing User and correct input filling 
	@Autowired
	private UserValidator userValidator;
	
	//Registration handling
	@GetMapping("/reg")
	public String registration(Model model)
	{
		model.addAttribute("userForm", new User());
		
		return "registration";
	}
	//Registration persisting handling with Validation
	@PostMapping("/reg")
	public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult){
		userValidator.validate(userForm, bindingResult);
		if(bindingResult.hasErrors()) {
			
			return "registration";
		}
		userService.saveRoles();
		userService.save(userForm);
		
		securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());
		
		return "redirect:/doctors";
	}
	//Username and password correctness checking
	@GetMapping("/login")
	public String login(Model model,String error, String logout) {
		if(error != null)
			{
			model.addAttribute("error","Your username and password is invalid.");
			
			// Custom Exception
			try {
				throw new IncorrectUsernamePasswordException(error);
			} catch (IncorrectUsernamePasswordException e) {
				e.printStackTrace();
			}
			}
		
		if(logout != null)
			model.addAttribute("message", "You have been logged out succesfully.");
		
		return "login";
	}
	//Redirection handling after logging in
	@PostMapping("/login")
	public String loggedin(Model model)
	{
		return "redirect:/doctors";
	}
	
	
}
