package com.deepu.method.reference;

import java.util.function.BiFunction;

public class ArbitaryObjectExample {

	public static void main(String[] args) {
		
		String str1 = "Hello ";
		String str2 = "World";
		
		BiFunction<String,String,String> concat = String::concat;
		String str3 = concat.apply(str1,str2);
		System.out.println(str3);
	}
}
