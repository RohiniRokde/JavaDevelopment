package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	public ProductController() {
		
		System.out.println("Product::Constructor");
		
	
	}
	//http request handler method
	
	@RequestMapping(value="/products")
	public String ProductMethod() {
		
		System.out.println("Inside Product Method....!");
		return "product";
		
	}
	

}
