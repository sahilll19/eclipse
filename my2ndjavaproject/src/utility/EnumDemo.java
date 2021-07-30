package utility;
enum OperatingSystems {
	windows, unix, linux
}
public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			OperatingSystems os;
			os= OperatingSystems.unix;
			switch(os)
			{
			case windows:
				System.out.println("You chose windows");
				break;
			case unix:
				System.out.println("You chose unix");
				break;
			case linux:
				System.out.println("You chose linux");
				break;
			}
	}

}
