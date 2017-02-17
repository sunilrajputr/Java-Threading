package com.sunil.java.threading.startup;

public class nostatic {

	String s1 = " this ";
	int i = 0;
	
	public int incrementNum(){
		
		i = i+1;
		System.out.println(" i = " + i +  " Thread " + Thread.currentThread().getName());
		
		return i;
	}
	
}
