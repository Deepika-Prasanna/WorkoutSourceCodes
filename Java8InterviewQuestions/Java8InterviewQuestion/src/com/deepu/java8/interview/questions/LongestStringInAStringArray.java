// To find the longest string from the given string array

package com.deepu.java8.interview.questions;

import java.util.Arrays;
import java.util.Optional;

public class LongestStringInAStringArray {

	public static void main(String[] args) {
		
		String[] stringArray = {"java", "techie", "springboot", "microservices"};
		
		String longestString = Arrays.stream(stringArray).reduce((a,b) -> a.length() > b.length() ? a : b).get();
	
		System.out.println(longestString);
	}
	
}
