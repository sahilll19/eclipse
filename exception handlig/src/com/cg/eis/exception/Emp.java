package com.cg.eis.exception;

public class Emp {
	
	public static void mSalary(int salary) throws EmpException {
		if (salary<3000)
			throw new EmpException("Need more salary!!");
		else
			System.out.println("Thank You!");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			mSalary(40000);
		}
		catch(EmpException ex) {
			System.out.println(ex);
		}

	}

}
