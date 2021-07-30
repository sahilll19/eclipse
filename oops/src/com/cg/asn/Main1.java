package com.cg.asn;



public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Account a=new Account();
			System.out.println(a.accountNo+" "+a.accountType+" "+a.accountBalance);
			a.setAccountDetails();
			a.withdraw();
//			a.deposit();
			a.dispAccountDetails();
				
				
			
	}

}
