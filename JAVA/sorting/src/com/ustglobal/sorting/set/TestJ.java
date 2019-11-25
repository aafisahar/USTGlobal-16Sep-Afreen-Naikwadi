package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
		
		SortById si = new SortById();
		TreeSet<Customer> ts = new TreeSet<>(si);
		
		Customer c1 = new Customer("Aafi", 44, 55000);
		Customer c2 = new Customer("Sadi", 299, 50000);
		Customer c3 = new Customer("Afrya", 65, 43000);
		Customer c4 = new Customer("Nishi", 12, 48000);
		Customer c5 = new Customer("Nishi", 12, 48000);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);
		
		System.out.println("------using iterator------");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Pincode is "+e.id);
			System.out.println("MICR is "+e.salary);
			System.out.println("---------------------");
		}
	}
}
