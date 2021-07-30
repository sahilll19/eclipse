package com.cg.eis.exception;

class Activity{
	String string1;
	String string2;
	String operator;
	public String getString1() {
		return string1;
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public String getString2() {
		return string2;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Activity(String string1, String string2, String operator) {
		super();
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}
	
}

public class Source {

	public static void main(String[] args) {
	
	}
		
		// TODO Auto-generated method stub
		 String handleException (Activity a) {
		       try{
		    
		       if(a.getString1()== null || a.getString2() == null)
		        throw new NullPointerException("Null Values Found");

		        if(a.getOperator() != "+" && a.getOperator()!= "-")
		        throw new Exception();
		        else
		        	System.out.println("No Exception Found");
		        
		        
		         }
		         catch(NullPointerException ex) {
		  
		           System.out.println(ex.getMessage());
		         }
		         catch(Exception ex){
		           System.out.println(ex.getMessage());
		         }
			return "No Exception Found";
		     

	}

}
