package JavaCodes;

import java.util.*;

public class RemoveDuplicatInt {

	public static void main(String[] args) {
		int[]  arr = {1,2,1,3,4,2,4,3,5};
		
		Set<Integer> set = new HashSet<>();
		
		for(int n : arr) {
			set.add(n);
			
		}
		System.out.println(set);
	}

}
