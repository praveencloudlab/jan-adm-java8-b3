package com;

public class Circle extends Shape {
	
	 static void s1() {
		 System.out.println("Circle :: s1");
	 }
	
	

	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}
	
	void loadData() {
		System.out.println("... loading data of Cicrcle");
	}

}
