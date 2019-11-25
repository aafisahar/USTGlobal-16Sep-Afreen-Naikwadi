package com.ustglobal.maps;

import java.util.*;

public class TestF {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Sahar", 89.4);
		Student s2 = new Student(2, "Sufi", 81.99);
		Student s3 = new Student(3, "Siraj", 86.87);
		Student s4 = new Student(4, "Minnu", 78.2);
		Student s5 = new Student(5, "Amreen", 67.89);
		Student s6 = new Student(6, "Ayan", 94.34);
		Student s7 = new Student(7, "Afreen", 90.12);
		Student s8 = new Student(8, "Aafi", 83.66);
		Student s9 = new Student(9, "Sufiya", 86.78);
		
		
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		
		ArrayList<Student> al3 = new ArrayList<>();
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", al1);
		hm.put("second", al2);
		hm.put("third", al3);
		
		ArrayList<Student> first = hm.get("second");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.perc);
		}
	}
}
