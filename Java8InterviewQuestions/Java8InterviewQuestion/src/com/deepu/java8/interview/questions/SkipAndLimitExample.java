// Skip and Limit Example. To print the numbers 2 to 8 in the range of 1 to 10

package com.deepu.java8.interview.questions;

import java.util.stream.IntStream;

public class SkipAndLimitExample {
	
	public static void main(String[] args) {
		
		IntStream.rangeClosed(1, 10).skip(1).limit(8).forEach(System.out::println);
	}

}
