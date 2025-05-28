package com.Annotation.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Annotation.Connection.Class.DBConnection;
import com.Annotation.Connection.Config.BeanConfiguration;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		DBConnection dbconnection = context.getBean("DBConnection", DBConnection.class);

		dbconnection.getCon().commit();
		dbconnection.getCon().rollback();

	}

}
