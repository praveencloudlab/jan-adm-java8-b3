package com;

public class Test {

	public static void main(String[] args) {
		
		Product p1=new Product(10, "Pen", 34.65, 23, "Red Ink", true);
		System.out.println(p1);
		System.out.println("------------------------");
		System.out.println(p1.getProductName());

	}

}
