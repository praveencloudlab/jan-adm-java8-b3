package com;

public class DbConnection {
	
	private static DbConnection con=null;
	
	// disable default constructor using private access modifier
	private DbConnection() {
		
	}
	
	public static DbConnection getConnection() {
		
		if(con==null)
			con=new DbConnection(); // this line skipped if con is not null
	
		return con;	
	}
	
	
	
	
	
	public void connect() {
		System.out.println("connected to database on "+this.hashCode());
		//System.out.println(this.getClass().getName()); // Reflection api
	}

}
