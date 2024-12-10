package com.deepu.method.reference;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		
		BiConsumer<PrintStream, String> biconsumer = PrintStream::println;
		biconsumer.accept(new PrintStream(System.out), "I am printing this to console");
		
	}
}
