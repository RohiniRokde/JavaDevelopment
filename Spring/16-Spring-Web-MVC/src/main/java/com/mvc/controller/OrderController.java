package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	
public OrderController() {
		
		System.out.println("Order::Constructor");

}

//http request handler method

	@RequestMapping(value="/orders")
public String OrderMethod() {
	
	System.out.println("Inside Order Method....!");
	return "order";
	
}
}
