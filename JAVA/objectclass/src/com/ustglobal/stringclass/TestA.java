package com.ustglobal.stringclass;

public class TestA {

	public static void main(String[] args) {
		
	String s1 = "Afreen";
	String s2 = "Sufi";
	
	String s3 = new String("Afreen");
	String s4 = new String("Afreen");
	String s5 = "Afreen";
	String s31 = s3.concat(" Sahar");
	System.out.println(s31);
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s3.equals(s4));
	System.out.println(s1.equals(s5));
	
	String s6 = s2.toLowerCase();
	System.out.println(s6);
	String s7 = s1.toUpperCase();
	System.out.println(s7);
	char c = s1.charAt(0);
	System.out.println(c);
	
	boolean b = s2.equalsIgnoreCase("sUfI");
	System.out.println(b);
	
	System.out.println("-------------------------");
	
	StringBuffer sbf = new StringBuffer("Afreen");
	StringBuffer sbf2 = sbf.append(" Sahar");
	System.out.println(sbf2);
	
	
	}
}
