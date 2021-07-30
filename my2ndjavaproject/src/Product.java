import java.util.Scanner;

public class Product {
int id;
String name;
int qty;
double price;
double totalcost;

void readProductDetails() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter product name, id, qty and price");
	id= sc.nextInt(); sc.nextLine();
	name= sc.nextLine();
	qty= sc.nextInt();
	price= sc.nextDouble();
	
}

void calcTotalPrice() {
	totalcost= qty*price;
}

void displayProductBillDetails() {
	System.out.println("id: " +id);
	System.out.println("Name: " +name);
	System.out.println("Qty: " +qty);
	System.out.println("Price: " +price);
	System.out.println("Total Cost:" +totalcost);
	}


}
