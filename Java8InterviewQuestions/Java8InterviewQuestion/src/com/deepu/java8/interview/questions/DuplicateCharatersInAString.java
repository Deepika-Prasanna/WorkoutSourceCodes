//To find the duplicate characters in a given String

package com.deepu.java8.interview.questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharatersInAString {
	
	public static void main(String[] args) {
		
		String str = "ilovejavatechie";
		
		List<String> duplicateList = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
		.entrySet().stream().filter(s -> s.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
	
		System.out.println(duplicateList);
	}

}