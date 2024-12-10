package com.deepu.workouts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Deepu",36);
		Student s2 = new Student(2,"Dhruvith", 8);
		Student s3 = new Student(3,"Prasanna",77);
		Student s4 = new Student(4,"Sujatha",62);
		Student s5 = new Student(5,"Adveesh",72);
		Student s6 = new Student(6,"Veda",42);
		Student s7 = new Student(7,"Chandu",40);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		
		System.out.println("Sorting by Age");
		Collections.sort(studentList, new AgeComparator());
		for(Student stud : studentList) {
		System.out.println(stud);
		}
		
		System.out.println();
		
		System.out.println("Sorting by Name");
		Collections.sort(studentList, new NameComparator());
		for(Student stud : studentList) {
			System.out.println(stud);
		}
		
		
		
	}

}