package JavaCodes;


public class LargestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,89,90,47,65,8};
		
		int max = arr[0];
		for(int i=0;i< arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}

		System.out.println(max);
	}

}

