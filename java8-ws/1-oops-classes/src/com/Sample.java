package com;

public class Sample {
	
	static int x;
	
	void f3() { // non static method
		Employee empObj=new Employee();
		empObj.empId=97493;
		Employee.a=8877;
	}
	
	static void f4() { // static method
		Employee empObj=new Employee();
		empObj.empId=9689;
		Employee.a=3434;
	}

}
