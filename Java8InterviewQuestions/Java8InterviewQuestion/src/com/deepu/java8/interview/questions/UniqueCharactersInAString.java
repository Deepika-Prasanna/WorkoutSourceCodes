package com.deepu.java8.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharactersInAString {
	public static void main(String[] args) {
		String str = "ilovejavatechie";
		
		List<String> uniqueElements = Arrays.stream(str.split(""))
									  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
									  .entrySet().stream()
									  .filter(s -> s.getValue() == 1)
									  .map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(uniqueElements);
	}

}
