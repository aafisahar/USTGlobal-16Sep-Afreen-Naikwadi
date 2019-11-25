package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestG {

	 public static void main(String[] args) {
		
		 ArrayList<Employee> al = new ArrayList<>();
		 
		 Employee e1 = new Employee(1, "Aafi");
		 Employee e2 = new Employee(4, "Sufi");
		 Employee e3 = new Employee(8, "Ayan");
		 
		 al.add(e1);
		 al.add(e2);
		 al.add(e3);
		 
		 Comparator<Employee> cmp = (c1, c2) -> {
			 return c1.name.compareTo(c2.name);
		 };
		 
		 List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());
		 
		 Iterator<Employee> it = l.iterator();
		 while(it.hasNext()) {
			 
			 Employee e = it.next();
			 System.out.println("Id is "+e.id);
			 System.out.println("Name is "+e.name);
			 System.out.println("---------------------");
		 }
		 
	}
}
