/*
 * 1. Eager Initialization (Thread-safe):
         In this approach, the instance is created when the class is loaded. It's simple and effective but might create an instance 
         even if it's never used.
         
         i)   The Singleton instance is created when the class is loaded.
		 ii)  getInstance() returns the already created instance.
		 iii) Thread-safe because the instance is created at the time of class loading and doesn't require synchronization.
 */


package com.deepu.singletondesingpattern;

public class SingletonEagerInitialization {
	
	private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();
	
	private SingletonEagerInitialization() {
		
	}

	public static SingletonEagerInitialization getInstance() {
		return instance;
	}
}
