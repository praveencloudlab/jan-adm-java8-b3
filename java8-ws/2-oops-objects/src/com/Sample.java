package com;

public class Sample {
	
	public void f1() { // instance method
		System.out.println("f1 method");
	}
	
	public static void f2() { // static method
		System.out.println("f2 method");
	}

	public static void main(String[] args) {
		// to invoke any non static or instance methods, object is needed
		Sample s=new Sample();
		
		s.f1();
		f2();
	
		Sample.f2();
		Test.testMethod();
		
		

	}

}




