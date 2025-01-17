package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(12);
		l.add(34);
		l.add(45);
		l.add(26);
		l.add(89);
		
		Integer peekElement = l.peek();
		System.out.println("Peek Element "+peekElement);
		Integer peekFirstElement = l.peekFirst();
		System.out.println("Peek First Element "+peekFirstElement);
		Integer peekLastElement = l.peekLast();
		System.out.println("Peek Last Element "+peekLastElement);
		System.out.println("After peek---> "+l);
		
		System.out.println("---------------------------------------");
		
		Integer pollElement = l.poll();
		System.out.println("Poll Element "+pollElement);
		Integer pollFirstElement = l.pollFirst();
		System.out.println("Poll First Element "+pollFirstElement);
		Integer pollLastElement = l.pollLast();
		System.out.println("Poll Last Element");
		System.out.println("After poll---> "+l);
		
		l.push(12);
		System.out.println("After push---> "+l);
		Integer p = l.pop();
		System.out.println("After pop---> "+l);
		
	}
}
