package com;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee();
		
		emp.setEmpId(10);
		//emp.empId=10;
		emp.setEmpName("Praveen");
		//emp.salary=70000;
		emp.setSalary(70000);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		
	}

}
