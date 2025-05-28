package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.byConstructor.Student;

public class Test {
	
	public static void main(String[] args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	
	Student stu=context.getBean("stu", Student.class);
	
	System.out.println("Student Rollno:" + stu.getRollno());
	System.out.println("Student Name:" + stu.getName());
	System.out.println("Cityname:" + stu.getAddress().getAreaname());
	System.out.println("Areaname:" + stu.getAddress().getCityname());
	
	
	
	
	}
	
	

}
