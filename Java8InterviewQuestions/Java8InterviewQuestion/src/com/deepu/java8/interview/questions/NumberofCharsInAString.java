// To find the each character occurrence

package com.deepu.java8.interview.questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberofCharsInAString {

	public static void main(String[] args) {
		String str = "ilovejavatechie";
		Map<String,Long> map = Arrays.stream(str.split(""))
								.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}
}
