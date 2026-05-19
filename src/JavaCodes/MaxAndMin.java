package JavaCodes;

import java.util.*;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {1,2,5,6,8,9};
		
		List<Integer> list = Arrays.asList(arr);
		
		System.out.println("Max number :"+ Collections.max(list));
		System.out.println("Min Number : "+ Collections.min(list));

	}

}
