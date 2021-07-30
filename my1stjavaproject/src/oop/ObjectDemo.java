package oop;

class Employee
{
	String ename;
	byte age;
	double salary;
	
	public Employee(String ename, byte age, double salary) {
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}
	public String toString() {
		return "Name: " +ename+ " Age: " +age+ " Salary: " +salary;
		
	}
}


public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Suvan", (byte) 22, 50000);
		System.out.println(emp.hashCode());
		System.out.println(emp);
		
		
		

	}

}
