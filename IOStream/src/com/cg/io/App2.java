package com.cg.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileReader fr = new FileReader("courses.txt");
				BufferedReader br = new BufferedReader(fr);){
			String line= br.readLine();
			while(line!= null) {
				System.out.println(line);
				line = br.readLine();
			}
		
		}catch (FileNotFoundException e) {
			System.out.println("File is not available");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("unable to read");
		}
				
	}

}
