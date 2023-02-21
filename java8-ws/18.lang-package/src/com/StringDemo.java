package com;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1="Abc"; 
		
		System.out.println("S1: "+s1);
		System.out.println("S1 Hashcode: "+s1.hashCode());
		
		s1="Xyz"; //immutable
		
		System.out.println("---------------------------------");
		
		System.out.println("S1: "+s1);
		System.out.println("S1 Hashcode: "+s1.hashCode());
		
		
		
	}

}
