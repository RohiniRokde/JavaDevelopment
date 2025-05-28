package com.Annotation.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Annotation.Test.Configuration.SpringBeanConfig;
import com.Annotation.Test.Student.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringBeanConfig.class);
		
		   Employee emp1=context.getBean("getEmployee",Employee.class);
		
		   Employee emp2=context.getBean("getEmployee",Employee.class);
			
		   Employee emp3=context.getBean("getEmployee",Employee.class);
			
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		

	}

}
