package com.Annotation.Connection.Class;

import org.springframework.stereotype.Component;

@Component
public class Mysql implements Connection  {

	@Override
	public void commit() {
	 System.out.println("Mysql...commit");	
		
	}

	@Override
	public void rollback() {
		System.out.println("Mysql...rollback");
		
	}
	
	

}
