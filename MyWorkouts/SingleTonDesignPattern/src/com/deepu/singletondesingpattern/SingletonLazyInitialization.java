/*
 * 2. Lazy Initialization (Non-Thread Safe):
		In this approach, the instance is created only when getInstance() is called. However, it is not thread-safe and should 
		be avoided in multi-threaded environments.
		
		i)  The Singleton instance is created only when getInstance() is called for the first time.
		ii) This approach is not thread-safe. If multiple threads access the getInstance() method concurrently, multiple instances 
		    might be created.
 */

package com.deepu.singletondesingpattern;

public class SingletonLazyInitialization {
	
	private static SingletonLazyInitialization instance;
	
	private SingletonLazyInitialization() {
		
	}

	public SingletonLazyInitialization getInstance() {
		if(instance == null) {
			instance = new SingletonLazyInitialization();
		}
		return instance;
	}
}
