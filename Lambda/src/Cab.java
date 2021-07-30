@FunctionalInterface
interface Cab {
	void bookCab(String source, String destination);

}

class Booking{
	static int var= 20;
	
	public static void main(String[] args) {
		
		
		
		Cab cab= (source, destination)-> {
			int local= 100;
			System.out.println("Cab is booked from " +source+ " to " +destination+ " !! Arriving soon!!");
			System.out.println("Static Variable: " +var);
			System.out.println("Local Variable: "+local);
		};
		cab.bookCab("Nagpur Airport", "Yashwant Stadium");
	}
}
