package com.deepu.method.reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ArraysAsListExample {

	public static void main(String[] args) {
		
		Integer[] myarray = {1 , 2 , 3 , 4 , 5, 6, 7, 8, 9, 10};
		
		Function<Integer[], List<Integer>> myFunction = Arrays::asList;
		List<Integer> myList = myFunction.apply(myarray);
		System.out.println(myList);
		
	}
}
