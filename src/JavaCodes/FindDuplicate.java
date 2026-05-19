 package JavaCodes;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "seleniumtesting";
		
		Set<Character> set = new HashSet<>();
		Set<Character> dupli = new HashSet<>();
		
		
		for(char c : s.toCharArray()) {
			if(!set.add(c)) {
				dupli.add(c);
			}
		}
		System.out.println("Duplicate Value: "+dupli);
		System.out.println("unique Value: "+set);
	}

}
