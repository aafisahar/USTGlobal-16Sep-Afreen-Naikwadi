package com.ustglobal.java8features;

import java.util.*;

public class TestS {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1, "Aafi", 88.23));
		al.add(new Student(2, "Sufi", 90.99));
		al.add(new Student(3, "Nish", 59.78));
		al.add(new Student(4, "Minnu", 36.5));
		al.add(new Student(5, "Sadi", 62.56));
		
		Helper h = new Helper();
//		h.displayAllStudent(al);
//		h.displayFailedStudent(al);
		h.displayPassedStudent(al);
		h.displayTopperStudent(al);
		
		
	}
}
