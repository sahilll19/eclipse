package my2ndjavaproject;

class Father {
	int age;
	String name;
	Father(){
	age=58;
	name= "Odin";
	
}
	void showFatherDet() {
		System.out.println(age+" "+name);
	}
}
	class Son extends Father {
		String name;
		Son(){
			name="Thor";
		}
		void showSonDet() {
			System.out.println(this.name);
		}}
		
		class Son1 extends Son {
			String name;
			Son1(){
				name="Loki";
			}
			void showSon1Det() {
				System.out.println(this.name);
			}
		}
	

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Son s = new Son();
			s.showFatherDet();
			s.showSonDet();
			Son1 l=new Son1();
			l.showFatherDet();
			l.showSonDet();
			l.showSon1Det();
	}

}
