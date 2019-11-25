package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestG {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(4);
		v.add(32.88);
		v.add("meow");
		v.add(false);
		v.add(null);

		System.out.println("-------for loop---");
		for(int i = 0; i < v.size(); i++) {
			System.out.println(i);
		}

		System.out.println("-------for-each loop---");
		for(Object o : v) {
			System.out.println(o);
		}

		System.out.println("-------iterator---");
		Iterator it = v.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

		System.out.println("-------list-iterator forward---");
		ListIterator lt = v.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}

		System.out.println("-------list-iterator backward---");
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}
	}
}
