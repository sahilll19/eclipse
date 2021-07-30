import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.*;
 class Arraylo{
	 public ArrayList<Integer> makeArrayListInt(int n) {
		 

		 	ArrayList<Integer>arr = new ArrayList<Integer>(n);

			for(int i=0; i<=n; i++)
			arr.add(i, 0);

			return arr;

	 }
	 
	 public ArrayList<Integer> reverseList(ArrayList<Integer>arr)  {
		 Collections.reverse(arr);
		 System.out.println(arr);
		return arr;
		
	 }
	 
	 public ArrayList<Integer> changeList(ArrayList<Integer>arr, int m, int n){
		 
		 int indexM = arr.indexOf(Integer.valueOf(m));
		 arr.remove(indexM);
		 arr.add(indexM, n);
		return arr;
		 
	 }
	 
	
 }
public class Fibonacci {
	

//	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylo a = new Arraylo();
		a.makeArrayListInt(5);
		//a.reverseList();
	
	
	

//		

	    
	    
	

//		   

	}


	
	  }

	

		
	


