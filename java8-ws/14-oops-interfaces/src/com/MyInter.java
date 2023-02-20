package com;

public interface MyInter {
	
	 void f1(); // by default, public and abstract
	//public abstract void f1();
	 
	 int MAX_AGE=87; // by default, public, final and static
	
    // void f2() {} // invalid
	 
	 /*
	  * from java 8, few new features are added.
	  * 1.default methods
	  * 
	  */
	 
	 default void f2() {
		 
	 }
	 
	 default void f3() {
		 
	 }
	 
	 
	 
	 
	 
}
