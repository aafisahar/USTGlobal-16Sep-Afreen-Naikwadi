package com.ustglobal.accessmodifiers.pkg1;

import com.ustglobal.accessmodifiers.pkg2.Demo;

public class Sample extends Demo {
     public static void main(String[] args) {
		
	Demo d = new Demo();
	//Private
	//System.out.println(d.a);
	//Not possible
	
	//Default 
   //System.out.println(d.b);
   //d.sub();
	//Not possible
	
	//Protected
	Sample sa = new Sample();
	System.out.println(sa.c);
	sa.mul();
	
	//Public
	System.out.println(d.name);
	d.div();
	
     }
}
