package com;

public class Test {

	public static void main(String[] args) {
		//DbConnection c1=new DbConnection();
		//DbConnection c2=new DbConnection();
		
		DbConnection c1=DbConnection.getConnection();
		DbConnection c2=DbConnection.getConnection();
		
		c1.connect();
		c2.connect();
		

	}

}
