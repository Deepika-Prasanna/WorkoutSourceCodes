/*
 * Singleton Pattern Integrity: 
 * 		While reflection allows breaking the Singleton pattern, it's generally considered an attack on the pattern. 
 * 		Developers can protect against this by adding checks inside the constructor to prevent multiple instances from being 
 * 		created through reflection. For example, you can throw an exception if the instance is already created.
 * 
 * Protecting Singleton from Reflection:
 *		You can modify the Singleton class to prevent reflection from breaking the pattern by adding a check in the constructor
 */


package com.deepu.singletondesingpattern;

public class SingletonProtectionFromReflection {
	
	private static SingletonProtectionFromReflection instance;

	private static boolean isInstanceCreated = false;
	
	private SingletonProtectionFromReflection() {
		
		if(isInstanceCreated) {
			throw new IllegalStateException("Singleton instance already created");
		}
		isInstanceCreated = true;
	}
	
	public static SingletonProtectionFromReflection getInstance() {
		if(instance == null) {
			instance = new SingletonProtectionFromReflection();
		}
		return instance;
	}
}
