 package JavaCodes;
import java.util.*;
public class CharCount {

	public static void main(String[] args) {
		
		String s = "automationtetsing";
		
		Map<Character, Integer > map = new HashMap<>();
		for(char ch : s.toCharArray()) {		
		map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
		
		String str = "I have java interview today I have ";
		
		String[] words = str.split(" ");
		
		Map<String,Integer> map1 = new HashMap<>();
		
		for(String word : words) {
			map1.put(word, map1.getOrDefault(word, 0)+1);
		}
		System.out.println(map1);
	}

}
