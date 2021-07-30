import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		double a = inp.nextDouble();
		double b = inp.nextDouble();
		
		System.out.println("Enter operator (+,-,*,/)");
		char operator= inp.next().charAt(0);
		switch(operator) {
		case '+' :
			System.out.println(a+b);
			break;
		case '-' :
			System.out.println(a-b);
			break;
		case '*' :
			System.out.println(a*b);
			break;
		case '/' :
			System.out.println(a/b);
			break;
			default:
				System.out.println("invalid");
		}
		
		
			
		
		

	}

}
