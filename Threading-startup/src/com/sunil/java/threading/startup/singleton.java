package com.sunil.java.threading.startup;

public class singleton {
	
	private static singleton s ;
	private static Object key = new Object();
	
	private String str;
	
	private singleton() {}

	public static synchronized singleton getInstance(){
		
		if ( s == null ){
			System.out.println(" new object created " + s + " by thread " + Thread.currentThread().getName());
			s = new singleton();
			System.out.println(" new object created " + s + "  after by thread " + Thread.currentThread().getName());

			return s;			
		}
		else 
		{
			//System.out.println(" returning same object" + s);
			return s;
			
		}
		
	}
}
