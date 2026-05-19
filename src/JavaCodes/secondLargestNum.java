package JavaCodes;
import java.util.*;

public class secondLargestNum {

	public static void main(String[] args) {
		
		int[] arr = {1,4,6,2,7,3,9};
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int n: arr) {
			
			set.add(n);
		}
		set.remove(set.last());
		System.out.println("The second largest number is :"+set.last());
	}

}
