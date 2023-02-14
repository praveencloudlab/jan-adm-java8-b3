package com;

public class ArrayTest {
	
	void  f1(int x[]) {
		
		System.out.println("inside method");
		x[1]=3500;
		for(int i:x) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
	}

	public static void main(String[] args) {
		
		int x[]= {10,20};
		
		ArrayTest at=new ArrayTest();
		
		System.out.println("before method");
		for(int i:x) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		
		at.f1(x);

		System.out.println("after method");
		for(int i:x) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
	}

}
