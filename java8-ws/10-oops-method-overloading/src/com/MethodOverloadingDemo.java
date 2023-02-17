package com;

public class MethodOverloadingDemo {
	
	/*
	 * method signature
	 * ========================
	 * 1.name of method
	 * 2.number of arguments
	 * 3.type of argument
	 * 4.position of arguments
	 * 
	 * note: return type is not considered.
	 */
	
	void f1() {}
	void f1(int x) {}
	
	void f1(float f) {}
	
	void f1(int x,int y) {}
	
	void f1(int x,float y) {}
	void f1(float x,int y) {}

	
	public static void main(String[] args) {
		System.out.println();
		
	}
	

}
