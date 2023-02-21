package com;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//StringBuffer sb="Abc"; // invalid
		StringBuffer sb1=new StringBuffer("Abc"); // synchronized
		StringBuilder sb=new StringBuilder("Abc");// not synchronized
		
		System.out.println("sb1: "+sb1);
		System.out.println("Hashcode of sb1: "+System.identityHashCode(sb1));
		sb1.append("Xyz");
		System.out.println("----------------------------");
		System.out.println("sb1: "+sb1);
		System.out.println("Hashcode of sb1: "+System.identityHashCode(sb1));

	}

}
