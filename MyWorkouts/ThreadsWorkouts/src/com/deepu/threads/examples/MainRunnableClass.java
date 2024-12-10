package com.deepu.threads.examples;

public class MainRunnableClass {
	
	public static void main(String[] args) {
		
		CreatingThreadWithRunnableInteface runnableThread = new CreatingThreadWithRunnableInteface();
		Thread thread = new Thread(runnableThread);
		thread.start();
		
		for(int i=0; i<1000; i++) {
			System.out.println("I am running from main thread");
		}
		
	}

}
