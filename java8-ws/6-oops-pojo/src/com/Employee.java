package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	public int getEmpId() {
		
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		this.salary=this.salary+15000;
		return salary;
	}

	public void setSalary(double salary) {
		// write BL
		// verify 
		this.salary = salary;
	}

}
