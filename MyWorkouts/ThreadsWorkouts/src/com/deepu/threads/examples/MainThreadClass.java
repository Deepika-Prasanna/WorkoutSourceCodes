package com.deepu.threads.examples;

public class MainThreadClass {
	
	public static void main(String[] args) {
		
		CreatingThreadWithThreadClass myThread = new CreatingThreadWithThreadClass();
		myThread.start();
		
		for(int i=0; i<1000; i++) {
			System.out.println("I am executed by main thread");
		}
		
	}

}
