package com.deepu.parallel.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class IterateExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> listOfInteger = new ArrayList<>();
		
		for(int i=1; i<=10;i++) {
			listOfInteger.clear();
			Stream.iterate(1, num -> num<=20, num -> num+1).parallel().forEach(num -> listOfInteger.add(num));
			
			System.out.println(listOfInteger);
			System.out.println(listOfInteger.size());
			
		}
	}
}
