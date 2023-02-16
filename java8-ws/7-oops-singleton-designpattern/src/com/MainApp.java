package com;

public class MainApp {

	public static void main(String[] args) {
		//JVM adds default constructor when you don't provide argument based constructor
		
		//Employee e1=new Employee(10,"Praveen");
		
		//System.out.println(e1.getEmpId());
		//System.out.println(e1.getEmpName());
		
		//System.out.println(e1);
		
		Employee emp=new Employee(111,"Kavya");
		
		emp.setEmpId(99);
		//emp.setEmpName("Ravi");
		
		//System.out.println(emp.getEmpId());
		//System.out.println(emp.getEmpName());
		
		//System.out.println(emp.hashCode());
		System.out.println(emp);
		

	}

}
