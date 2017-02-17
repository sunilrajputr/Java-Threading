package com.sunil.java.threading.startup;

public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		incrementer ic = new incrementer(0L);
		
		Runnable r1 = () -> {
			//System.out.println(" in thread " + Thread.currentThread().getName());
			for ( int i=0;i < 1_000;i++){
				ic.incrementVal();
			}
		};

		Thread[] t = new Thread[1_000];
		for( int j=0; j<t.length ; j++ ){
			t[j] = new Thread(r1);
			t[j].start();
		}
		
		for( int i = 0; i<t.length ; i++)
		{
			t[i].join();
		}
		
		System.out.println(" value is " + ic.getValue());
	}

}
