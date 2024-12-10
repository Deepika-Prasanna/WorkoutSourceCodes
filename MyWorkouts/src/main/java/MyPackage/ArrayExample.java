package MyPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayExample {
	public static void main(String[] args) {
		int[] myArr = { 4, 6, 5, -10, 8, 5, 20, 9, 1 };
		calculate(myArr, 10);
	}

	public static void calculate(int[] myArray, int number) {
		// Normal way
		/*for (int i = 0; i < myArray.length; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				int sum = myArray[i] + myArray[j];
				if (sum == number) {
					System.out.println(myArray[i] + "," + myArray[j]);
				}
			}
		}*/
		 
		// Using Set
		Set<Integer> mySet = new HashSet<>();
		for(int i=0;i<myArray.length;i++) {
			int diff = number - myArray[i];
			if(mySet.contains(diff)) {
				//System.out.println(number - myArray[i]+","+myArray[i]);
				for(int j=0; j<myArray.length;j++) {
					if(number - myArray[i] == myArray[j]) {
						if(j==i) {
							continue;
						}
						System.out.println(j+","+i);
					}
				}
			}
			mySet.add(myArray[i]);
		}
		
		

		// Using Map
		/*HashMap<Integer,Integer> hm = new HashMap<>();
		int count = 0;
		for(int i=0 ; i<myArray.length ; i++) {
			if(hm.containsKey(number - myArray[i])) {
				System.out.println(number - myArray[i]+" , "+myArray[i]);
			}
			else {
				hm.put(myArray[i], 1);
			}
		}*/
	}
}
