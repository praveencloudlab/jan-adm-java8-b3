package com;

public class StringDemo2 {
	
	
	
	public static void main(String[] args) {
		
		String s1="Abc";  // sting pool
		//String s2="Abc";
		//char ch[]= {'A','B','C','D'};
		
		String s2=new String("Abc"); // heap memory
		
		
		System.out.println("S1: "+s1);
		System.out.println("S1 Hashcode: "+s1.hashCode());
		System.out.println("S1 Hashcode: "+System.identityHashCode(s1));
		//s1="Xyz"; //immutable
		
		System.out.println("---------------------------------");
		
		System.out.println("S2: "+s2);
		System.out.println("S2 Hashcode: "+s2.hashCode());
		System.out.println("S2 Hashcode: "+System.identityHashCode(s2));

		
		// == always compares hashcode
		// equals : compares only content
		
		
		if(s1.equals(s2)) { //?
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		
	}

	

}
