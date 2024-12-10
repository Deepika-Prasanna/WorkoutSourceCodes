package com.deepu.method.reference;

import java.util.function.Function;

public class FunctionInterfaceExample {

	public static void main(String[] args) {
		
		Function<String, String> myFunction = String::toUpperCase;
		String strObj = myFunction.apply("Deepu");
		System.out.println(strObj);
	}
}
