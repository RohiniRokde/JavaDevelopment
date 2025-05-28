package com.AnnotationComponent;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (value= "prototype")
public class Employee {

	public Employee() {
		
		System.out.println("Employee:: Constructor");

}
}