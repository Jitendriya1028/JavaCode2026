package JavaCodes;

import java.util.*;

public class ConvertArraytoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {67,12,24,56};
		
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		
		//Collections.sort(list);
		
		System.out.println(list);

	}

}
