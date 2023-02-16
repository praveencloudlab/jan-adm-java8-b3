package com;

public class Employee { // java.lang.Object is the super class to all the classes
	
	private int empId;
	private String empName;
	
	// must disable default constructor
	// provide argument based constructor to mandate to provide empId,empName

	
	
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	
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


	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
	
	
	
	
	
	
	

}
