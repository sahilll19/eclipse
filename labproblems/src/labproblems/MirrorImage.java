package labproblems;

import java.util.Scanner;

public class MirrorImage {
	void getImage(String subject) {
		String sb = new StringBuilder(subject).reverse().toString();
		System.out.print(subject);
		System.out.print("|");
		System.out.println(sb);
		
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MirrorImage m = new MirrorImage();
		m.getImage("EARTH");
		
	}

}
