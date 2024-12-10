package com.deepu.method.reference;

import java.util.function.BiFunction;

public class AssignmentWorkout {

	public static void main(String[] args) {
		
		//int add = new AssignmentWorkout().sum(10, 20);
		//System.out.println(add);
		
		TriFunction<AssignmentWorkout, Integer, Integer, Integer> triFunction = AssignmentWorkout::sum;
		int result = triFunction.apply(new AssignmentWorkout(), 10, 20);
		System.out.println(result);
	
	}
	int sum(int a, int b) {
		return a+b;
	}
}
