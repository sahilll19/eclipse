import java.util.*;
public class App1 {
	public static void main(String[] args) {
		Vector<String>vec= new Vector<String>();
		
		vec.add("Dog");
		vec.add("Cat");
		vec.add("Tiger");
		
		vec.addElement("Lion");
		vec.addElement("Deer");
		
		System.out.println("Elements are: " +vec);
		System.out.println("Size :" +vec.size());
		
		if(vec.contains("Tiger"))
		{
			System.out.println("Tiger is present at the index: " +vec.indexOf("Tiger"));
		}
		else {
			System.out.println("Tiger is not present in the list");
		}
		
		System.out.println("First animal of the vector is: " +vec.firstElement());
		System.out.println("Last animal of the vector is: " +vec.lastElement());
	}

}
