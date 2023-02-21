package com;

public class Demo2 {

	public static void main(String[] args) {

		try {

			int[] x = new int[1];
			//x[65]=9988;
			int i = 10 / 0;

		} catch (NullPointerException ae) {
			ae.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
		}catch(Exception e) {
			System.out.println("failed due to "+e);
		}

	}

}
