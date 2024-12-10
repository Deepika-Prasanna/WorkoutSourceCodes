// To find the number that starts with 1 from the given int array

package com.deepu.java8.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWithOne {
	
	public static void main(String[] args) {
		
		int[] intArray = {5, 9, 11, 2, 8, 21, 1};
		
		List<String> numbersStartswithone = Arrays.stream(intArray).boxed()
		.map(num -> num+"").filter(num-> num.startsWith("1")).collect(Collectors.toList());
		
		System.out.println(numbersStartswithone);
	}

}
