package com;

public class CallByRefDemo {
	
	int x; // instance and class level property
	
	public void test(CallByRefDemo obj) { // obj is formal argument
		obj.x=obj.x+2000;
		System.out.println("inside test method: "+obj.x);
	
	}
	
	
	public static void main(String[] args) {
		
		CallByRefDemo cbr=new CallByRefDemo();

		cbr.x=1000;
		
		System.out.println("Beofre test method: x : "+cbr.x);
		cbr.test(cbr); // cbr is axtual argument
		System.out.println("After test method: x : "+cbr.x);
		
	}

}
