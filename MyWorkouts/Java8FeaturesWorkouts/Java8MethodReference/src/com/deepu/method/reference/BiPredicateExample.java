package com.deepu.method.reference;

import java.util.Objects;
import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		
		BiPredicate<String, String> equalsCheck = Objects::equals;
		boolean result = equalsCheck.test("Deepu", "Deepika");
	
		System.out.println(result);
	}
}
