package com.deepu.streamapi.examples;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest2 {
	
	public static void main(String[] args) {
		
		
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		};
		Stream<String> myStream = Stream.of("Deepu", "Dhruvith", "Prasanna", "Sujatha", "Adveesh", "Veda", "Chandu");
		myStream.forEach(consumer);
		
		Stream.of("Deepu", "Dhruvith", "Prasanna", "Sujatha", "Adveesh", "Veda", "Chandu")
		.forEach(consumer);
		
		Stream.of("Deepu", "Dhruvith", "Prasanna", "Sujatha", "Adveesh", "Veda", "Chandu")
		.forEach( t -> System.out.println(t));
		
		Stream.of("Deepu", "Dhruvith", "Prasanna", "Sujatha", "Adveesh", "Veda", "Chandu")
		.forEach(System.out::println);
	}

}
