package com;

public class Oracle implements Connection{ // single inheritance

	@Override
	public void connect() {
		System.out.println("connected to Oracle");
	}
}
