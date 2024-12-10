package com.deepu.string.workouts;

public class ReverseStringWithoutSpace {
	
	public static void main(String[] args) {
		
		String str = "Deepu";
		
		String reverse = reverseString(str);
		
		System.out.println(reverse);
	}

	private static String reverseString(String str) {
		
		char[] charArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=charArray.length-1; i>=0; i--) {
			sb.append(charArray[i]);
		}
		
		return sb.toString();
	}
}
