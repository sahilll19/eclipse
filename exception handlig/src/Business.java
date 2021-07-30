
public class Business {
	public String validateDetails(Employeedemo e1) throws ArithmeticException {
		
		if(e1.getBp()<=0 || e1.getHra()<=0 || e1.getTax()<=0)
			throw new ArithmeticException("invalid");
		if(e1.getEmpName().length()<3 || e1.getEmpId()<100)
			throw new ArithmeticException("Enter valid name or Emp id");
		else { System.out.println("valid"); }
		
		
		return "Employee valid";
		
		
	}
	
	public Integer calculateNetSalary(Employeedemo e1) {
		
		Integer netpay=null;
		try {
			validateDetails(e1);
			netpay= e1.getBp()+e1.getHra()-e1.getTax();
			
		}
		catch(ArithmeticException ex) {
			netpay=0;
		}
		finally {
			System.out.println("done");
		}
		
		return netpay;
	}
	
		
		
		

	
	}

