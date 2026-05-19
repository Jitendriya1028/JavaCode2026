package JavaCodes;
import java.util.*;
public class VowelCount2 {

	public static void main(String[] args) {
		String s  = "automationteating";
		int count =0;
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			if("aeiou".indexOf(c)!=-1) {
				
				map.put(c,map.getOrDefault(c,0)-1);
				count++;
			}
		}
		System.out.println(count);
		System.out.println(map);

	}

}
