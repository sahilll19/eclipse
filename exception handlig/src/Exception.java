
public class Exception extends Employeedemo {
	public static void main(String[] args)  {
		
		Employeedemo e1= new Employeedemo();
		e1.setAge(22);
		e1.setBp(20000);
		e1.setEmpId(200);
		e1.setEmpName("Adam");
		e1.setHra(2500);
		e1.setTax(500);
	    Business bl = new Business();
		
		System.out.println(bl.calculateNetSalary(e1));
		
		System.out.println("prg ends");
		
	}

}
