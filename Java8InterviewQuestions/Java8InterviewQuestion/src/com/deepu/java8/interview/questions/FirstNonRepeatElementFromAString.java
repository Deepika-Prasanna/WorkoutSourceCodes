// To find the frist non-repetative character from a given string

package com.deepu.java8.interview.questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatElementFromAString {
	
	public static void main(String[] args) {
		
		String str = "ilovejavathechie";
		
		String nonRepetativeCharacter = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
		.entrySet().stream().filter(s -> s.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
		
		
		System.out.println("First non repetative character is "+nonRepetativeCharacter);
	}

}
