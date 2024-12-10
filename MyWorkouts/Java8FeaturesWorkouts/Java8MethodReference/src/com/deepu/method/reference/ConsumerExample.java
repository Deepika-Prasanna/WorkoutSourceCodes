package com.deepu.method.reference;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		
		Consumer<String> printlogic = System.out::println;
		printlogic.accept("Print this to console");
	}
}
