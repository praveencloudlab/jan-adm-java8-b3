package com;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String s1="Abc";
		
		String newString = s1.concat("Xyz"); // immutable
		String newString1 = s1.toUpperCase();
		
		System.out.println(s1); // Abc
		System.out.println(newString);
		System.out.println(newString1);
		
		// charAt : char
		// indexOf : int
		
		//System.out.println(s1.charAt(0));
		//System.out.println(s1.indexOf('b'));
		
		
		//String s2="Hello I am good. I am fine. I am going. Hello";
		
		
		

	}

}
