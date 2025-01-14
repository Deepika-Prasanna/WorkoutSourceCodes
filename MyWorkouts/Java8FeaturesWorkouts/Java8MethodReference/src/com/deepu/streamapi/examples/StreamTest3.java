package com.deepu.streamapi.examples;

import java.util.Arrays;
import java.util.List;

public class StreamTest3 {
	
	public static void main(String[] args) {
		
		Student deepu = new Student(1, "Depu", 123456, 36);
		Student dhruvith = new Student(2, "Dhruvith", 234567, 8);
		Student prasanna = new Student(3, "Prasanna", 345678, 78);
		Student sujatha = new Student(4, "Sujatha", 456789, 62);
		Student adveesh = new Student(5, "Adveesh", 567891, 72);
		
		Student[] myStudentArray = {deepu, dhruvith, prasanna, sujatha, adveesh};
		
		List<Student> myList = Arrays.asList(myStudentArray);
		
		myList.stream().forEach(student -> System.out.println(student));
		
		
		
	}
}
