package com.ScopeStudent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Student.Employee;
import com.Student.Student;

public class Test {
	public static void main(String[] args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	
	 Student stu1= context.getBean("stu", Student.class);
	  
	 Student stu2= context.getBean("stu", Student.class);
	 
	 System.out.println(stu1.hashCode());
	 System.out.println(stu2.hashCode());
	 
	 Employee emp1=context.getBean("emp", Employee.class);
	  
	 Employee emp2=context.getBean("emp", Employee.class);
	 
	 System.out.println(emp1.hashCode());
	 System.out.println(emp2.hashCode());
	 
	 
	  
	  
	  
		
	}
	

}
