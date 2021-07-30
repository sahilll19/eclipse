package com.capgexc;

public class FullName {
	static void validateName() throws FullNameExc {
		String fname= "Brad";
		String lname = "Cooper";
		System.out.println(fname.replace(fname, lname));
		if(fname==null || lname==null)
			throw new FullNameExc("Enter Full Name");
		else
			System.out.println(fname +" "+ lname);
		}
	
	public static void main(String[] args) {
		try {
			validateName();
			
		}
		catch(FullNameExc a) {
			System.out.println("Exception: "+a);
			
			
			
		}
	}
}
