package com;

public class Student {
	
	String studentName;
	// this operator 
	
	/*
	Student() {
		System.out.println(">>>> Student object is created <<<<<");
	}
	*/
	
	Student(String name){
		studentName=name;
	}
	
	public void register() {
		System.out.println("Inside register method:");
		System.out.println("hashcode is "+this.hashCode());
		// this-> an object who invoked register method
		
		Registar r=new Registar();
		int admisionID = r.registerStudent(this);
		System.out.println("Student is admited. ID: "+admisionID);
	}
	
}
