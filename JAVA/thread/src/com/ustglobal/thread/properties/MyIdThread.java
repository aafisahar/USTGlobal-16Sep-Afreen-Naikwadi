package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {

	 public static void main(String[] args) {
		
		 System.out.println("main started");
		 
		 System.out.println("main thread id "+Thread.currentThread().getId());
		 
		 MyIdThread mi = new MyIdThread();
		 System.out.println("myid thread "+mi.getId());
		 
		 System.out.println("priority "+Thread.currentThread().getPriority());
		 
//		 Thread.currentThread().setPriority(0);  IllegalArgumentException
//		 Thread.currentThread().setPriority(12);
		 
		 System.out.println("main ended");
	}
}
