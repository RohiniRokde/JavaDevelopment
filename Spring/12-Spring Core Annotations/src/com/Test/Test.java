package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AnnotationComponent.Employee;
import com.AnnotationComponent.Student;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		 Student stu1 =context.getBean("student",Student.class);
		
		 Student stu2 =context.getBean("student",Student.class);
			
		 Student stu3 =context.getBean("student",Student.class);
			
		 
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		System.out.println(stu3.hashCode());
		
		
		 Employee emp1 =context.getBean("employee",Employee.class);
		
		 Employee emp2 =context.getBean("employee",Employee.class);
			
		 Employee emp3 =context.getBean("employee",Employee.class);
			
		 
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
	}
	}
	
	
	
	

