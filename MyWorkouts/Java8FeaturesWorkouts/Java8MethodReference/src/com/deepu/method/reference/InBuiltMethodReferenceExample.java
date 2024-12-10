package com.deepu.method.reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class InBuiltMethodReferenceExample {
	
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(8 , 1 , 5 , 9, 7, 2, 6, 3, 4);
		
		Consumer<List<Integer>> sortList = Collections::sort;
		sortList.accept(integerList);
		
		System.out.println(integerList);
		
	}

}
