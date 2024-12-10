package MyPackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class SortValueOFMap {

	public static void main(String[] args) {
		Map<Integer,String> myMap = new HashMap<>();
		myMap.put(5, "America");
		myMap.put(2, "India");
		myMap.put(3, "UK");
		myMap.put(1, "Japan");
		myMap.put(4, "Africa");

		Map<Integer,String> mySortedMap = sort(myMap);
		for(Entry<Integer, String> map : mySortedMap.entrySet()) {
			System.out.println(map.getKey()+" , "+map.getValue());
		}
		
	}
	
	public static Map<Integer,String> sort(Map<Integer, String> myMap){
		List<Map.Entry<Integer,String>> myList = new LinkedList<Map.Entry<Integer,String>>(myMap.entrySet());
		Collections.sort(myList, new Comparator<Map.Entry<Integer, String>>() {
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		Map<Integer,String> mySortedMap = new LinkedHashMap<>();	
		for(Map.Entry<Integer,String> map : myList) {
			mySortedMap.put(map.getKey(), map.getValue());
		}
		return mySortedMap;
		
	}

}
