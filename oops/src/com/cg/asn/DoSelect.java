package com.cg.asn;

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

class Source{
	public String handleException(Activity a) {
		String ret;
		try {
			if(a.getString1()== null || a.getString2()== null) {
				throw new NullPointerException("Null Values Found");
			
			}
			if(!a.getOperator().equals("+") && !a.getOperator().equals("-")) {
				throw new Exception(a.getOperator());
			
		}
		}
		catch(NullPointerException ex) {
			return ex.getMessage();
		}
		catch(Exception ex) {
			return ex.getMessage();
		}
		return "No Exception Found";
		
	}
	
	public String doOperation(Activity a) {
		String str= "";
		switch(a.getOperator()) {
		case "+" :
			str= a.getString1().concat(a.getString2());
		case "-" :
			str= a.getString1().replaceFirst(a.getOperator(), " ");
		}
		return str;
		
	}
}

public class DoSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source s = new Source();
		
		
		

	}

}
