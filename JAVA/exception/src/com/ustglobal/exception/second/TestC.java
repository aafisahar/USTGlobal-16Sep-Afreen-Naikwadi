package com.ustglobal.exception.second;

import java.util.Scanner;

import javax.naming.directory.AttributeInUseException;

public class TestC {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);
				Scanner sc1 = new Scanner(System.in)) {
			System.out.println("Enter your age");
			int age = sc.nextInt();
			System.out.println("age is "+age);
			
			System.out.println(age/0);
		} catch(ArithmeticException ae) {
			ae.printStackTrace();
		} finally {
			System.out.println("finally executed");
		}
		
		System.out.println("------------------------------");
	}
}
