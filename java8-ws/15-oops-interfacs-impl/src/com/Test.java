package com;

public class Test {

	
	public static void main(String[] args) {
	
		Connection con=new Oracle();
		con.connect();

		con=new MySQL();
		con.connect();
		
		con=new Sybase();
		con.connect();
	}

}
