package com.deepu.threads.examples;

public class CreatingThreadWithRunnableInteface implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("I am running from child thread");
		}
	}
	
}
