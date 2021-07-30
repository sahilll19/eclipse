
public class ClientTest {
	static String mname= "java";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Client c=new Client();
			System.out.println(c.id+"   "+c.name+"   "+c.payment+"   "+c.advance+"   "+c.balance);
			c.readDetails();
			c.calcBalance();
			c.dispDetails();
			System.out.println(mname);

//Client c1=new Client();
//
//
//c1.readDetails();
//c1.dispDetails();
 

	}

}
