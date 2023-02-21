package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		boolean flag=true;
		while (flag) {
			try {
				InputStreamReader ipr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(ipr);

				System.out.println("Enter a Number: ");
				int x = Integer.parseInt(br.readLine());
				System.out.println("X: " + x);
				flag=false;

			} catch (Exception e) {
				System.out.println("Invalid Input. try again.");
			}
		}

	}

}
