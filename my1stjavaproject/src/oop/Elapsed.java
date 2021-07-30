package oop;

public class Elapsed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start, end;
		
		start = System.currentTimeMillis();
		
		for(int i = 0; i<1000000; i++) ;
		end = System.currentTimeMillis();
		
		System.out.println("The elapsed time is " +(start-end));
	}

}
