package com.deepu.method.reference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		
		Supplier<Employee> mySupplier = Employee::new;
		Employee emp1 = mySupplier.get();
		System.out.println(emp1);
		
		
		Function<Integer, Employee> myFunction = Employee::new;
		Employee emp2 = myFunction.apply(2);
		System.out.println(emp2);
		
		BiFunction<Integer, String, Employee> myBiFunction = Employee::new;
		Employee emp3 = myBiFunction.apply(3, "Deepu");
		System.out.println(emp3);
		
	}
}
