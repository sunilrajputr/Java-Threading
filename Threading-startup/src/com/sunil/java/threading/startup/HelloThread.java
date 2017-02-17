package com.sunil.java.threading.startup;

public class HelloThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1 = () -> {
			System.out.println("I am running in " + Thread.currentThread().getName());
			//singleton.getInstance();
			nostatic ns = new nostatic();
			
			
			ns.incrementNum();
		};
		
		Thread[] tarray = new Thread[100];
		
		for( int i =0 ;i < 10 ; i++)
		{
			tarray[i] = new Thread(r1); 
			tarray[i].start();	
		}
				
		//System.out.println(" end" + t1.getName() + " 2nd thread name " + t2.getName());
	}

}
