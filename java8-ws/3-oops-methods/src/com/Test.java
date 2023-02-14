package com;

public class Test {
	
	void f1(){
		System.out.println("f1");
	}
	
	int f2() {
		return 100;
	}
	
	String f3() {
		return "hello";
	}
	
	void f4(int x) { // x is formal / dummy argument
		System.out.println("Square of "+x+" is "+(x*x));
	}
	

	public static void main(String[] args) {
		
		Test t=new Test();
		t.f1();
		int a = t.f2();
		System.out.println(a);
		
		String s1 = t.f3();
		System.out.println(s1);
		
		t.f4(6); // here 6 is actual argument
		t.f4(10);
		
		
		
		

	}

}
