package JavaCodes;
import java.util.*;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String str = "automation";

        Set<Character> set1 = new LinkedHashSet<>();

        for (char c1 : str.toCharArray()) {
            set1.add(c1);
        }

        System.out.println(set1);
		
		
	}

}
