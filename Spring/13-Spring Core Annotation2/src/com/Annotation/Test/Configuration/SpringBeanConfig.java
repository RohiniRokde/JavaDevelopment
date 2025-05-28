package com.Annotation.Test.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.Annotation.Test.Student.Employee;

@Configuration
@ComponentScan(basePackages="com.Annotation.Test")
public class SpringBeanConfig {
	
	public SpringBeanConfig() {
		
		System.out.println("SpringBeanConfig:: Constructor");
		
	}
	
	@Bean
	@Scope (value="prototype")
	public Employee getEmployee() {
	  return new Employee();
	  
	  
		
	}
	}


