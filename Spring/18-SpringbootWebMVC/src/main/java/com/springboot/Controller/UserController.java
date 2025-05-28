package com.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	//http request handler method
	
	@RequestMapping(value="/user")
	public String UserMethod() {
		
		System.out.println("Inside User Method....!");
		return "user";
		
	}

}
