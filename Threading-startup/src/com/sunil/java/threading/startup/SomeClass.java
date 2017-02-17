package com.sunil.java.threading.startup;

public class SomeClass {
	
	private Object key1 = new Object();
	private Object key2 = new Object();
	
	public  void methodA(){
		synchronized ( key1 ) {
			System.out.println(" [" + Thread.currentThread().getName() + "] -- MethodA " );
			methodB();
		}
	}

	public synchronized void methodB(){
		synchronized (key2) {
			System.out.println(" [" + Thread.currentThread().getName() + "] -- MethodB " );
			methodC();
		}
	}

	public  void methodC(){
		synchronized ( key1 ){
			System.out.println(" [" + Thread.currentThread().getName() + "] -- MethodC " );			
		}
	}
}
