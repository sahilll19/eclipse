package utility;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name= "Employee";
			String name1=new String("CGemployee");
			System.out.println(name1.charAt(2));
			System.out.println(name1.toLowerCase());
			System.out.println(name1.indexOf("o"));
			System.out.println(name1.startsWith("C"));
			
			String tokens[]=name.split("-"); 
			System.out.println(name1.concat(name));
			System.out.println(name1.substring(4,8));
			
			
			
			StringBuffer sb = new StringBuffer(name);
			System.out.println(sb.append(" "
					+ "old"));
			System.out.println(sb.delete(0, 4));
			System.out.println(sb.reverse());
			sb.insert(0, "play");
			
			//sb.insert(0, "false");
			System.out.println(sb);
			StringBuilder sbu = new StringBuilder(name1); //faster than string buffer
			
			
	}

}
