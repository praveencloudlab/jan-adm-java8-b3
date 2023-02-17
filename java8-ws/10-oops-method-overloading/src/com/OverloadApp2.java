package com;

public class OverloadApp2 {
	
	 void f1(int x) {
		System.out.println("int : "+x);
	}
	 void f1(long x) {
		System.out.println("long : "+x);
	}
	void f1(short x) {
		System.out.println("short : "+x);
	}
	void f1(byte x) { //1
		System.out.println("byte : "+x);
	}
	void f1(float x) {
		System.out.println("float : "+x);
	}
	void f1(double x) {
		System.out.println("double : "+x);
	}
	void f1(char x) {
		System.out.println("char : "+x);
	}
	
	
	public static void main(String[] args) {
		
		OverloadApp2 oa=new OverloadApp2();
		
		oa.f1(76.43f); // int
		
		
		
		
		
		
		
		
	}

}
