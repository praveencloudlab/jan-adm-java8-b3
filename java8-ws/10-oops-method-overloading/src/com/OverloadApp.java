package com;

public class OverloadApp {
	
	 void f1(int x) {
		System.out.println("int : "+x);
	}
	 void f1(long x) {
		System.out.println("long : "+x);
	}
	void f1(short x) {
		System.out.println("short : "+x);
	}
	void f1(byte x) {
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
		
		OverloadApp oa=new OverloadApp();
		oa.f1(76); // ?
		oa.f1(8867555L);
		oa.f1((short)776); // 
		oa.f1((byte)123);
		//==========================
		
		oa.f1(76.43); // double
		oa.f1(66.433f);
		//===========================
		
		oa.f1('A');
		oa.f1((char)97);
		oa.f1((int)'B');
		
	}

}
