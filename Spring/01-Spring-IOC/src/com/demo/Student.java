package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Student {
	
	public Student() {
		System.out.println("Student Constructor : ");
	}

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Student student = factory.getBean(Student.class);
		
	}
}
