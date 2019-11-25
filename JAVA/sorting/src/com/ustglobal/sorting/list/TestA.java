package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		
		Student s1 = new Student(1, "Sufi", 89.4);
		Student s2 = new Student(2, "shiFa", 77.3);
		Student s3 = new Student(4, "ayAn", 93.9);
		Student s4 = new Student(3, "Ali", 75.4);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("before sorting---> "+al);
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("after sorting---> "+al);
		displayStudentDetails(al);
	}
	
	static void displayStudentDetails(ArrayList<Student> al)
	{
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
		Student s = it.next();
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage is "+s.perc);
		System.out.println("-----------------------");
		}
	}
}
