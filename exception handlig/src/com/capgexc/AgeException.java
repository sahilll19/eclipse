package com.capgexc;

public class AgeException  {
	
	static void validate(int age) throws InvalidAgeException{
		if(age<15)
			throw new InvalidAgeException("Underage");
		else 
			System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(19);
		}
		catch(InvalidAgeException ex) {
		System.out.println("Exception: "+ex);
}
		
}}