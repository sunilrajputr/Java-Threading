package com.sunil.java.threading.startup;

public class incrementer {

	private long l;
	private final Object key = new Object();

	public incrementer ( long l1)
	{
		this.l = l1;
	}
	
	public long getValue() {
		return l;
	}

	public void incrementVal() {
		// remove synchronize to find race condition.
		synchronized (key) {
			l = l + 1;	
		}
		
		
	}
	
	
}
