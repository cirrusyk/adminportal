package com.adminportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(){
		return "redirect:/manageUsers";
	}
	
	@RequestMapping("/manageUsers")
	public String home(){
		return "manageUsers";
	}
	
	@RequestMapping("/manageOrders")
	public String manageOrders(){
		return "manageOrders";
	}
	
	
	
	@RequestMapping("/newReleases")
	public String newReleases(){
		return "newReleases";
	}
	
	@RequestMapping("/basketBallShoes")
	public String basketBallShoes(){
		return "basketBallShoes";
	}
	
	@RequestMapping("/runningShoes")
	public String runningShoes(){
		return "runningShoes";
	}
	
	@RequestMapping("/about")
	public String about(){
		return "about";
	}
	
	
	
	
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
