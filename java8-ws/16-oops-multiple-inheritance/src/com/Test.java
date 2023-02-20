package com;

public class Test {

	public static void main(String[] args) {
		
		
		 Customer cust=new Bank();
		 BankEmployee be=new Bank();
		 BankManager bm=new Bank();
		 
		 cust.deposit();
		 cust.withDraw();
		 
		 be.openAccount();
		 be.closeAccount();
		 
		 bm.netBanking();
		 
		 
		 
		 
		 
		 
		
		/*
		BankOps bo=new Bank();
		
		bo.closeAccount();
		bo.openAccount();
		
		bo.withDraw();
		bo.deposit();
		
		*/
		
		

	}

}
