package com.cg.asn;


public class Account {
	int accountNo;
	String accountType;
	int accountBalance;
	
	void setAccountDetails() {
//		System.out.println(accountNo+" "+accountType+" "+accountBalance);
		accountNo= 1234567890;
		accountType= "Savings";
		accountBalance= 50000;
	}
	void withdraw() {
		accountBalance -= 1000;
	}
	void deposit() {
		accountBalance+= 1000;
		
	}
	void dispAccountDetails () {
		System.out.println("Account number:  "+accountNo);
		System.out.println("Account type:  "+accountType);
		System.out.println("Account balance  "+accountBalance);
	}
	
}


