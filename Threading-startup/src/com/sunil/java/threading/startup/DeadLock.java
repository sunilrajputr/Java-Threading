package com.sunil.java.threading.startup;

public class DeadLock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SomeClass sm = new SomeClass();
		
		Runnable r1 = () -> sm.methodA();
		Runnable r2 = () -> sm.methodB();
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.start();
		
		t1.join();
		t2.join();
		
		//sm.methodA();
	}

}
