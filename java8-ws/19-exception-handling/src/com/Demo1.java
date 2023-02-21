package com;

public class Demo1 {
	public static void main(String[] args) {

		try {
			int x = 10 / 0;
			System.out.println(x);
		} catch (Exception e) {
			System.out.println("failed due to " + e);
		}finally {
			System.out.println("always ....");
			System.out.println("important part fo a logic..");
		}
		

	}

}
