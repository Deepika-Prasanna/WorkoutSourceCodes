package MyPackage;

import java.util.HashMap;
import java.util.Map;

public class MapExampleGeneric {
	
	public static void main(String[] args) {
		
		Map<Integer,String> myMap = new HashMap<>();
		myMap.put(1, "Deepika");
		myMap.put(2, "Dhruvith");
		myMap.put(3, "Ullas");
		
		for(Map.Entry m:myMap.entrySet()) {
			System.out.println(m.getKey() + " -> " + m.getValue());
		}
	}

}
