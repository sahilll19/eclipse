
public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product p=new Product();
System.out.println(p.id+" "+p.name+" "+p.qty+" "+p.price+" "+p.totalcost);
p.readProductDetails();
p.calcTotalPrice();
p.displayProductBillDetails();



	}

}
