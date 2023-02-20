package com;

public class MySQL implements Connection{
	@Override
	public void connect() {
		System.out.println("connected to MySQL");
	}

}
