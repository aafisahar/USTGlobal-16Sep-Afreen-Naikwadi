package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread {

	public static void main(String[] args) {
		System.out.println("main started");
		
		int p = Thread.currentThread().getPriority();
		System.out.println("main thread priority "+p);
		
		Thread.currentThread().setPriority(8);
		System.out.println("new main thread priority "+Thread.currentThread().getPriority());
		
		MyPriorityThread t = new MyPriorityThread();
		int q = t.getPriority();
		System.out.println("mypriority thread priority "+q);
		
		t.setPriority(4);
		System.out.println("new mypriority thread priority "+t.getPriority());
		
		System.out.println("main ended");
	}
}
