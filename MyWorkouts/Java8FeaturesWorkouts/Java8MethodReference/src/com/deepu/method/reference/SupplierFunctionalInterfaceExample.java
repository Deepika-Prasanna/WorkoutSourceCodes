package com.deepu.method.reference;

import java.util.function.Supplier;

public class SupplierFunctionalInterfaceExample {

	public static void main(String[] args) {
		
		String str = "Deepu";
		Supplier<String> supply = str::toUpperCase;
		String toUpperCase = supply.get();
		System.out.println(toUpperCase);
		
	}
}
