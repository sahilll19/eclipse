import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	
	public static void main( String args[] ) {
		final String REGEX = "java";
		final String INPUT = "java java java J2SE java";

		  Pattern p = Pattern.compile(REGEX);
	      Matcher m = p.matcher(INPUT);   // get a matcher object
	      int count = 0;

	      while(m.find()) {
	         count++;
	         System.out.println("Match number "+count);
	         System.out.println("start(): "+m.start());
	         System.out.println("end(): "+m.end());
	      
	   }
	     

		   Pattern p1= Pattern.compile("12");
		   Matcher m1=p1.matcher("1231212512512");
		   if(m1.find())
		   { System.out.println("available");}
		   	else {
			   System.out.println("not available");
		   	} 

}	
			
//			 String to be scanned to find the pattern.
//		   String line = "This order was places for QT3000! OK?";
//			String pattern = "(.*)(\\d+)(.*)";
//
//			// Create a Pattern object
//			Pattern r = Pattern.compile(pattern);
//	//
//			// Now create matcher object.
//			Matcher m2 = r.matcher(line);
//			if (m1.find()) {
//				System.out.println("Found value: " + m2.group(0));
//				System.out.println("Found value: " + m2.group(1));
//				System.out.println("Found value: " + m2.group(2));
//				System.out.println(m2.find());
//				} else {
//				System.out.println("NO MATCH");
				
				
				
			}
			
