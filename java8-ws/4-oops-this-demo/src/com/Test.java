package com;

public class Test {

	public static void main(String[] args) {
		
		Student s=new Student("Praveen");
		//s.studentName="James";

		System.out.println("Hashcode of s is "+s.hashCode());
		s.register(); // register method invoked by an object 's'

	}

}
