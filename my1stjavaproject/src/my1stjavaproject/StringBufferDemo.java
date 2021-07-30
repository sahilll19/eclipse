package my1stjavaproject;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer buffer = new StringBuffer("Genuine");
//		buffer.append("e");
		System.out.println(buffer);
		
		buffer.append(45);
		System.out.println(buffer);
		
		//default capacity of string buffer is 16, tf 16+genuine = 23
		System.out.println(buffer.capacity());
		
		String m;
		int a = 8;
		StringBuffer bu = new StringBuffer(99);
		m = bu.append(a).toString();
		System.out.println(bu);
		
		bu = new StringBuffer("Ys");
		bu.insert(1, "e");
		System.out.println(bu);
		
		

	}

}
