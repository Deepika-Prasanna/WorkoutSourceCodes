package com.deepu.general.workouts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToCreateObjectInJava {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, 
												  NoSuchMethodException, SecurityException, IllegalArgumentException, 
												  InvocationTargetException, CloneNotSupportedException, IOException {
		
		System.out.println("********* Using new Keyword *********");
		Student s1 = new Student();
		System.out.println(s1);
		System.out.println(s1.name);
		
		System.out.println();
		
		System.out.println("********* Using newInstance of Class class *********");
		//Student s2 = (Student) Class.forName("com.deepu.general.workouts.Student").newInstance(); // 1st way to load the class
		Student s2 = (Student) Student.class.forName("com.deepu.general.workouts.Student").newInstance(); //// 2nd way to load the class
		System.out.println(s2);
		System.out.println(s2.name = "Deepika");
		
		System.out.println();
		
		System.out.println("********* Using newInstance of Constructor class *********");
		Constructor<Student> consructor = Student.class.getConstructor(); //Loading the class
		Student s3 = consructor.newInstance();
		System.out.println(s3);
		System.out.println(s3.name = "Dhruvith");
		
		System.out.println();
		
		System.out.println("********* Creating the object by clone() *********");
		Student s4 = (Student)s3.clone();
		System.out.println(s4);
		System.out.println(s4.name = "Prasanna");
		
		System.out.println();
		
		System.out.println("********* Using Deserialization *********");
		FileOutputStream fos = new FileOutputStream("text.txt"); // Serializing the Student object
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student student = new Student();
		oos.writeObject(student);
		
		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s5 = (Student) ois.readObject();
		System.out.println(s5);
		System.out.println(s5.name = "Shashi");
	}

}