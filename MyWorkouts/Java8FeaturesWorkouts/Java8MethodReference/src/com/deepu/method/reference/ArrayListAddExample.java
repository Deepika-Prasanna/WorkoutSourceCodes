package com.deepu.method.reference;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class ArrayListAddExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> myArrayList = new ArrayList<>();
		//myArrayList.add("Deepu");
		//System.out.println(myArrayList);
		
		BiFunction<ArrayList<String>, String, Boolean> biFunction = ArrayList::add;
		Boolean isAdded = biFunction.apply(myArrayList, "Deepu");
		System.out.println(isAdded);
		System.out.println(myArrayList);
	}

}
