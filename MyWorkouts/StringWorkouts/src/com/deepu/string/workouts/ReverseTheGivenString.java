// Reverse the given string which has space

package com.deepu.string.workouts;

public class ReverseTheGivenString {
	
	public static void main(String[] args) {
		
		String str = "String reverse program";
		
		String reverse = reverseString(str);
		
		System.out.println("Reversed String is " + reverse);
	}

	private static String reverseString(String str) {
		
		String[] words = str.split("\\s+");
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=words.length-1; i>=0; i--) {
			
			sb.append(words[i]);	
			
			if(i!=0) {
				sb.append(" ");
			}
		}
		
		return sb.toString();
	}

}
