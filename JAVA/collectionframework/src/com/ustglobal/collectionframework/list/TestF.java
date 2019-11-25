package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestF {

	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		
		li.add(4);
		li.add(32.88);
		li.add("meow");
		li.add(false);
		li.add(null);
		
		System.out.println("-------for loop---");
		for(int i = 0; i < li.size(); i++) {
			System.out.println(i);
		}
		
		System.out.println("-------for-each loop---");
		for(Object o : li) {
			System.out.println(o);
		}
		
		System.out.println("-------iterator---");
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("-------list-iterator forward---");
		ListIterator lt = li.listIterator();
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
