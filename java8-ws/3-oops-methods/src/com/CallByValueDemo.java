package com;

public class CallByValueDemo {
	
	void f1(int x) { // x is formal argument
		x=x+200;
		System.out.println("Inside f1 method: X: "+x);
	}

	public static void main(String[] args) {
		
		int x=100;
		
		CallByValueDemo cvd=new CallByValueDemo();
		System.out.println("Before calling f1 method: X: "+x);
		cvd.f1(x); // x is called actual argument
		System.out.println("After calling f1 method: X: "+x);
		
		
		

	}

}
