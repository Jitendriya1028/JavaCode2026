package JavaCodes;

import java.util.*;

public class RemoveZeroArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,0,2,0,8,0,7};
		
		List<Integer> list = new ArrayList<>();
		for(int n : arr) {
			if(n!=0) {
				list.add(n);
			}
		}
		System.out.println(list);

	}

}
