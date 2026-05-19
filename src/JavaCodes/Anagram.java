package JavaCodes;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="listen";
		String s2 ="silent";
		
	/*	if(s1.length() != s2.length()) {
			System.out.println("Not Anagram");
			
		}*/
		
		char[] ch1 =s1.toCharArray();
		char[] ch2 =s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("This is Anagram");
		}else {
			System.out.println("This is not Angram");
		}

	}

}
