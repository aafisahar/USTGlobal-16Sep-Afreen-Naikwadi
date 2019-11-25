package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestL {

	public static void main(String[] args) {
		
		Comparator<Employee2> com = (e1,e2)->{
			if(e1.height>e2.height) {
				return 1;
			} else if(e1.height<e2.height) {
				return 1;
			} else {
				return 0;
			}
		};
		
		TreeSet<Employee2> ts = new TreeSet<>(com);
		
		Employee2 e1 = new Employee2(4, "Aafi", 5.4);
		Employee2 e2 = new Employee2(8, "Sufi", 5.1);
		Employee2 e3 = new Employee2(10, "Ayan", 6.0);
		Employee2 e4 = new Employee2(12, "Minnu", 5.4);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("------using iterator------");
		Iterator<Employee2> it = ts.iterator();
		while(it.hasNext()) {
			Employee2 e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Pincode is "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("---------------------");
		}
	}
}
