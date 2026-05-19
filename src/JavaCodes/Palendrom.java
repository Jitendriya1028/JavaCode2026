
package JavaCodes;

public class Palendrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madam";
		String rev= "";
		
		for(int i = s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
			
			
		}
		if(s.equals(rev)) {
			System.out.println("This is palendrom");
		}else {
			System.out.println("This is not palendrom");
		}

	}

}
