package com.Annotation.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Annotation.Test.Class.Address;
import com.Annotation.Test.Class.Student;
import com.Annotation.Test.Config.BeanConfiguration;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Student stu=context.getBean("student",Student.class);
		
		System.out.println( "rollno:  "+ stu.getRollno());
		System.out.println("name :  "+ stu.getName());
		System.out.println("marks:  "+stu.getMarks());
		
		Address adr=context.getBean("address",Address.class);
		
		System.out.println("cityname:  " +adr.getAreaname());
		System.out.println("areaname: "+adr.getCityname());
		
		
		
	}

}
