package com;

public class Employee {
	
	/*
	 * 1.variables
	 * 2.constructors
	 * 3.methods
	 * 4.blocks
	 * 5.inner classes
	 * 6.interfaces
	 * 
	 * 1.variables : 2 types
	 * ========================
	 * 1.instance variables: data of instance variables are unique 
	 *   to each object.
	 *   ex: empId,empName,salary
	 * 2.static variables: data of static variables are common 
	 *   for all objects
	 *   ex: companyName, mgrName, cityName
	 *   
	 * 2.constructors
	 * =================
	 * -> constructors are executed by itself at the time of object 
	 *    creation
	 * -> constructor name and class name must be same
	 * -> we use constructors to mandate any variables initiation 
	 * -> constructors must not return anything. But can have
	 *    arguments
	 * 
	 * 3.methods : 2 types
	 * ======================
	 * 1.instance methods : data is unique to each object
	 * 2.static methods : data is sharable among all objects
	 * 
	 * rules
	 * ------
	 * 1.every method must return a value. If there is nothing to
	 *   return, then return type should be 'void'
	 * 2.methods may or may not have arguments
	 * 
	 * 
	 * instance data
	 * ==================
	 * -> instance data is unique to all objects
	 * -> instance data can be accessed from all instance methods. 
	 * 
	 * static data
	 * =============
	 * -> static data is sharable to all the objects.
	 * -> static data can be accessed directly from any static method
	 * 
	 * 
	 *  note
	 *  =====
	 *  -> in order to access instance data from any static methods,
	 *     object must be needed. 
	 *     
	 *  why objects are needed?
	 *  ==========================
	 *  1.to allocate memory for all instance variables
	 *  2.to access instance methods and variables from static methods
	 *    of the same class.
	 *  3.to access instance methods and variables from static and 
	 *    non static methods from other classes
	 * 
	 *  where to create objects?
	 *  =============================
	 *  -> object should be created in any static methods of the same class
	 *     to access instance data
	 *  -> objects should be created in any static and non static methods
	 *     from other classes to access instance data
	 *  
	 *  
	 *  notes
	 *  ======
	 *  -> static data can be accessed directly from the same class
	 *  -> static data can be accessed with class name from 
	 *     other classes.
	 * 
	 * 
	 * 
	 * 
	 *    methods
	 *    =============
	 *    1.instance
	 *    2.static
	 *    3.final
	 *    4.native
	 *    5.default
	 *    
	 *    class
	 *    ========
	 *    1.concrete class
	 *    2.final class
	 *    3.abstract class
	 *    
	 * 
	 * 
	 */
	
	
	 int empId; // instance property / variable / field
	 static int a; // static property / variable / field
	 
	 void f1() { // instance method / non static
		 empId=10; // valid
		 a=98; // valid
	 }
	 
	 static void f2() { //static method / non instance method
		  a=8888;
		// empId=9993; // invalid
		 Employee empObj=new Employee();
		 empObj.empId=458489;
		 
	 }
	 
	 

	public static void main(String[] some_variable) {
		
		//empId=98; // invalid
		a=988;
		
		// steps to create object 
		// call constructor of class using new keyword
		
		Employee e= new Employee(); // allocate memory
		Employee e1= new Employee(); // allocate memory
		
		e.empId=87;
		e1.empId=45;
		
		System.out.println("e: "+e.empId);
		System.out.println("e1: "+e1.empId);
		
		System.out.println("e: "+e.a); // need not be called by obj name
		System.out.println("e1: "+e1.a);// need not be called by obj name
		System.out.println("===================");
		
		System.out.println(a);
		
		Sample.x=1000;
		System.out.println(Sample.x);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
