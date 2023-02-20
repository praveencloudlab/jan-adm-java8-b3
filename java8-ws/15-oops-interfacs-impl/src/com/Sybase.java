package com;

public class Sybase implements Connection{
	
	@Override
	public void connect() {
		System.out.println("connected to Sybase DB");
	}

}
