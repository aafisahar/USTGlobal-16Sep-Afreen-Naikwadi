package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(12);
		marks.add(3);
		marks.add(44);
		marks.add(97);
		marks.add(53);
		marks.add(22);
		marks.add(10);
		marks.add(71);
		
		Comparator<Integer> cmp = (m1, m2) -> {
			if(m1>m2) {
				return 1;
			} else if(m1< m2) {
				return -1;
			} else {
				return 0;
			}
		};

		long noOfFailedStudents = marks.stream().filter(i -> i < 50).count();
		System.out.println(noOfFailedStudents);
			
		System.out.println("--------------------");
		Integer i = marks.stream().min(cmp).get();
		System.out.println("Min Marks "+i);
		
		System.out.println("--------------------");
		Integer j = marks.stream().max(cmp).get();
		System.out.println("Max Marks "+j);
		

	}
}
