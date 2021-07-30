package com.cg.asn;

public class Employee {
	int id;
	String name;
	String ssn;
	String dept;
	int salary;
	Employee(){}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getSsn() {
		return ssn;
	}
	void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, String ssn, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", ssn=" + ssn + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	

}
class EmployeeApp {
	
	void getEmployeeInfo(String str) {
		
	
	String name= str.substring(0,(str.indexOf('@')));
}
}
