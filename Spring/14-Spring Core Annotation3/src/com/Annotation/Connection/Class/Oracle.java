package com.Annotation.Connection.Class;

import org.springframework.stereotype.Component;

@Component
public class Oracle implements Connection {

	@Override
	public void commit() {
    System.out.println("Oracle....commit");
	}

	@Override
	public void rollback() {
		System.out.println("Oracle...rollback");


		
	}
	
	

}
