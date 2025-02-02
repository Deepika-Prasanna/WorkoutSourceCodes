package com.deepu.method.reference;

import java.util.function.BiFunction;

public class BiFunctionMethodReference {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> sumImpl = Integer::sum;
		Integer sum = sumImpl.apply(10, 20);
		
		System.out.println(sum);
	}
}
