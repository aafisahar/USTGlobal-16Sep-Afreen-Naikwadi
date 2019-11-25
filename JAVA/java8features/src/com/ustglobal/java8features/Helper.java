package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	void displayAllStudent(ArrayList<Student> al) {
		
		System.out.println("****List of All Students****");

		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {

			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.perc);
			System.out.println("--------------------------");
		}

	}
	void displayFailedStudent(ArrayList<Student> a) {

		List<Student> l = a.stream().filter(student -> student.perc < 40).collect(Collectors.toList());
		
		System.out.println("****Failed Student****");

		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {

			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.perc);
			System.out.println("--------------------------");
		}

	}

	void displayPassedStudent(ArrayList<Student> a) {

		List<Student> l = a.stream().filter(student -> student.perc >= 40).collect(Collectors.toList());
		
		System.out.println("****Passed Student****");

		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {

			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.perc);
			System.out.println("--------------------------");
		}

	}
	
	void displayTopperStudent(ArrayList<Student> a) {
		
		Comparator<Student> cmp = (m1, m2) -> {
			if(m1.perc > m2.perc) {
				return 1;
			} else if(m1.perc < m2.perc) {
				return -1;
			} else {
				return 0;
			}
		};
		
		Student s = a.stream().max(cmp).get();
		
		System.out.println("****Topper****");

			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.perc);
	}
	
}