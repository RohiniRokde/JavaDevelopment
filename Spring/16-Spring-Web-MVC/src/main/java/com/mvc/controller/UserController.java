package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	
public UserController() {
		
		System.out.println("User::Constructor");
}

//http request handler method

	@RequestMapping(value="/users")
public String UserMethod() {
	
	System.out.println("Inside User Method....!");
	return "user";
	
}
}
