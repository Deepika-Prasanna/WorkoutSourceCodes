package com.deepu.general.workouts;

import java.io.Serializable;

public class Student implements Cloneable, Serializable{

	String name = "Deepu";
	
	public Student(){
		System.out.println("Calling Student constructor to creat Student Object");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
