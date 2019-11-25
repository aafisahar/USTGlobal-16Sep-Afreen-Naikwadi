package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {

	int id;
	String name;
	double perc;
	
	public Student(int id, String name, double perc) {
		super();
		this.id = id;
		this.name = name;
		this.perc = perc;
	}

	@Override
	public int compareTo(Student s) {
		if(this.id>s.id) {
			return 1;
		}else if(this.id<s.id) {
			return -1;
		}else {
			return 0;
		}
	}
	
//	@Override
//	public int compareTo(Student s) {
//		if(this.perc>s.perc) {
//			return 1;
//		}else if(this.perc<s.perc) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}
	
//	@Override
//	public int compareTo(Student s) {
//		
//		String p = this.name;
//		String q = s.name;
//		String x = p.toUpperCase();
//		String y = q.toUpperCase();
//		return x.compareTo(y);
//	}


}
