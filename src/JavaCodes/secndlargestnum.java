package JavaCodes;

import java.util.*;

public class secndlargestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {12,3,5,7,9,7,8};
		
		TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
		List<Integer> list = new ArrayList<>(set);
		
		System.out.println("Second largest num :"+ list.get(list.size()-2));
		
		

	}

}
