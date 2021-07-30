package utility;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			byte b= 44;
			Byte bObj= new Byte(b);
			byte  bObjval=bObj.byteValue();
			
			//conversion
			String age="30";
			int s = Integer.parseInt(age);	
			System.out.println(s);
			double s1 = Double.parseDouble(age);
			long s3 = Long.parseLong(age);
			
			int p=60;
			double x=p;
			
			double w=70;     //double to int
			int t=(int)w;
			
			
			String sum ="852";
			int n = Integer.parseInt(sum);
			System.out.println(n);
	}

}
