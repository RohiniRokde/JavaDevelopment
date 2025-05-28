package com.collectionStudent;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collection.Student;

public class Test {
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Student stu=context.getBean("stu" , Student.class);
		
		System.out.println("Student rollno:"+ stu.getRollno());
		
		System.out.println("Student rollno:"+ stu.getName());
		
		List<String> friends=stu.getFriends();
		friends.forEach(friend->System.out.println(friend));
		
		System.out.println("*******");
		
		Set<String>mails=stu.getMails();
		mails.forEach(System.out::println);
		
		System.out.println("*******");
		
		Map<String, Double> courses=stu.getCourses();
		
		Set<String>keys=courses.keySet();
		
		
		for(String key:keys) {
			
			Double value=courses.get(key);
			System.out.println("Key:"+  value);
			
			
			
			
		}		
	}		
	

}
					