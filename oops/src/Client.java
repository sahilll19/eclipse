
public class Client {
	int id;
	String name;
	double payment;
	double advance;
	double balance;


	void readDetails() {
	id=107;
	name="Sahil";
	payment=21000;
	advance=10000;
}
	void calcBalance() {
	balance= payment-advance;
}
	void dispDetails() {
	
	System.out.println("id: "+id);
	System.out.println("name: "+name);
	System.out.println("payment: "+payment);
	System.out.println("advance: "+advance);
	System.out.println("balance: "+balance);
}


}
