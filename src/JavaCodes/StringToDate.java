package JavaCodes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StringToDate {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String s = "12-05-2026 11:15:34";
		
		Date d;
		try {
			d = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		

	}

}
