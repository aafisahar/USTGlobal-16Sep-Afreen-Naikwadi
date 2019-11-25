package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestC {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(44.44);
		al.add("Minnu");
		al.add(false);
		
		ListIterator li = al.listIterator();
		
		System.out.println("---------forward-----");
		while(li.hasNext()) {
			Object o = li.next();
			System.out.println(o);
		}
		
		System.out.println("---------backward-----");
		while(li.hasPrevious()) {
			
			Object o = li.previous();
			System.out.println(o);
		}
		
	}
}
