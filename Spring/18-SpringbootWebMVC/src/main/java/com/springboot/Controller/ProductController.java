package com.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	//http request handler method
	
	@RequestMapping(value="/products")
	public String ProductMethod() {
		
		System.out.println("Inside Product Method....!");
		return "product";
		
	}
	

	
	
	

}
