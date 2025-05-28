package com.HasATest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.HasA.Student;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Student st=context.getBean("stu",Student.class);
		
		System.out.println("Student Rollno:" + st.getRollno());
		System.out.println("Student Name:" + st.getName());
		
		System.out.println("Pincode:"+ st.getAdd().getPincode());
		System.out.println("Pincode:"+ st.getAdd().getArea());
		System.out.println("Pincode:"+ st.getAdd().getCity());

	}

}
