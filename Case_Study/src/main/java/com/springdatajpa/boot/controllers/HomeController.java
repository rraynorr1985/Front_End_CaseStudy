package com.springdatajpa.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//First page rendering
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	

}
