package MyPackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstOccurenceOfTheLetter {
	public static void main(String[] args) {
		String s1 = "RahulSinghRajput";
		char ch = nonRepeatingString(s1);
		System.out.println(ch);
	}

	private static char nonRepeatingString(String s1) {
		Map<Character,Integer> hm = new LinkedHashMap<>();
		char[] ch = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count=0;
			if(!hm.containsKey(ch[i])) {
				hm.put(ch[i], ++count);
			}else {
				hm.put(ch[i], hm.get(ch[i])+1);
			}
		}
		for (Entry<Character, Integer> entry : hm.entrySet()) {
            if(entry.getValue() == 1) {
            	return entry.getKey();
            }
		}
		return 0;
	}

}
