package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {
		
		SortByName sb = new SortByName();
		SortByPincode sp = new SortByPincode();
		SortByMicr sm = new SortByMicr();
		
		TreeSet<Bank> ts = new TreeSet<Bank>(sp);
		Bank b1 = new Bank("SBI", 590010, 426822684l);
		Bank b2 = new Bank("Canara", 590011, 235648490l);
		Bank b3 = new Bank("HDFC", 598610, 123567890l);
		Bank b4 = new Bank("ICICI", 523456, 987654213l);
		Bank b5 = new Bank("ICICI", 523456, 987654213l);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("------using iterator------");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Pincode is "+e.pincode);
			System.out.println("MICR is "+e.micr);
			System.out.println("---------------------");
		}
	}
}
