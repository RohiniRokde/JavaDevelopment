package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Farmer {
	
	public Farmer() {
		System.out.println("Farmer Constructor");
	}

	
	public static void main(String[] args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Farmer farmer=(Farmer) context.getBean("farmer",Farmer.class);
	//Resource resource =new ClassPathResource("beans.xml");
	//BeanFactory factory = new XmlBeanFactory(resource);

		//Farmer far=factory.getBean(Farmer.class) ;
	}

}