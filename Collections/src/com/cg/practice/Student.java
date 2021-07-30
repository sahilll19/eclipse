package com.cg.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	

}

class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
	if(o1.age>o2.age)
		return 1;
	else if(o1.age==o2.age)
		return 0;
	else
		return -1;
	}
	
}
class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}
}




class Simple{
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Sudhanshu", 21));
		al.add(new Student(110, "Madhur", 23));
		al.add(new Student(113, "Arpit", 20));
		al.add(new Student(115, "Joy", 30));
		
		System.out.println("Sorting by name:");
		
		Collections.sort(al,new NameComparator());
		for(Student s:al) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
		
		System.out.println("Sorting by age: ");
		
		Collections.sort(al, new AgeComparator());
		for(Student s:al) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
		
	}
}