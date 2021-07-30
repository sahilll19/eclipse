package my1stjavaproject;

public class SimpleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a[] = {'a', 'b', 'c'};
		String c = new String(a);
		String m = new String(c);
		System.out.println(c);
		System.out.println(m);
		
		//string concatenation
		String ab = "hello" + "world";
		System.out.println(ab);

	}

}
