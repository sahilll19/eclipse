package my1stjavaproject;

public class CommaOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) 
		{
      System.out.println("i= " + i + " j= " + j);
		}
		for(int i=0, j=i+99; i<101; i++, j=i/2 ) {
			System.out.println("i= " +i + " j= "+j);
	}
		
		int n=0;
		while(n<10)
		{ System.out.println(n);
		n++;
		}
		
//	    int a = 1;
//	    int b = 2;
//	    int c = 3;
//	   
//	    a += 5;
//	    b *= 4;
//	    c += a * b;
//	    c %= 6;
//	    System.out.println("a = " + a);
//	    System.out.println("b = " + b);
//	    System.out.println("c = " + c);


	}

}
