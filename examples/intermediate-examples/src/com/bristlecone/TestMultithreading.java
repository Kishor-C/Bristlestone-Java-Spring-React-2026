package com.bristlecone;

/*
 * Runnable interface - public void run
 */

class R implements Runnable { 
	@Override
	public void run() {
		// it returns currently running thread that has CPU time
		Thread t = Thread.currentThread();
		String name = t.getName(); // name of the thread
		for(int i = 1; i <= 500; i++) {
			System.out.println("Run method: "+i+", thread name = "+name);
		}
	}
}
public class TestMultithreading {
	public static void main(String[] args) {
		R r = new R(); // shared object
		// thread must know from where it must begin, hence we pass Runnable type
		Thread t1 = new Thread(r, "A"); 
		Thread t2 = new Thread(r, "B");
		Thread t3 = new Thread(r, "C");
		// if thread is created it doesn't get the cpu time, so it doesn't start
		t1.start(); // now thread is eligible to get the CPU time
		t2.start();
		t3.start();
		System.out.println("main method ends...");
	}
}
