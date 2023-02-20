package com;

public class Bank implements Customer,BankEmployee, BankManager{
	
	@Override
	public void netBanking() {
		System.out.println("Netbanking is authorized...");
	}
	
	public void deposit() {
		System.out.println("depositing..");
	}

	public void withDraw() {
		System.out.println("withdrawing..");
	}

	public void openAccount() {
		System.out.println("openning account..");
	}

	public void closeAccount() {
		System.out.println("closing account");
	}

}
