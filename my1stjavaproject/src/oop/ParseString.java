package oop;

import java.util.Scanner;

public class ParseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		
		Scanner scanner = new Scanner("1,2,3,4,5").useDelimiter(",");
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			if(n%2==0) {
				System.out.println(n);
			}
				
		}
		
		

	}

}
