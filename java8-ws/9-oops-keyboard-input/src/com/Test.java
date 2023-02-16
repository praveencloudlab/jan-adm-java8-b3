package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		
		System.out.println("Provide employee ID: ");
		emp.setEmpId(sc.nextInt());
		System.out.println("Provide Name: ");
		sc.nextLine(); // fake read line to store previous input key
		emp.setEmpName(sc.nextLine());
		System.out.println("Provide Salary: ");
		emp.setSalary(sc.nextDouble());
		System.out.println(emp);
	}

}
