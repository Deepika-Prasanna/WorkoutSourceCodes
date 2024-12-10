package com.deepu.general.workouts;

public class Test1 {

	public static void main(String[] args) {
		String a = "hellow.com";
		if (a.toUpperCase().matches("com")) {
			System.out.println("Matched");
		} else if (a.matches(".*[com].*")) {
			System.out.println("Pattern");
		} else {
			System.out.println("Not Found !");
		}
	}
}
