package com.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	
	//http request handler method
	
	@RequestMapping(value="/order")
	public String OrderMethod() {
		
		System.out.println("Inside Order Method....!");
		return "order";
		
	}

}
