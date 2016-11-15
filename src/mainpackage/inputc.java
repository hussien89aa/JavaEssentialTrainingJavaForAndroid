 package mainpackage;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/*
 * by hussein alrubye
 * app get user info from console
 *  
 */
public class inputc {
	public static void main(String[] args)
	{
		
		// this take user name from input
		String name=args[0];
		// get user age
		String provider=args[1];
		System.out.println("name:"+ name);
		System.out.println("provider:"+ provider);
	}
}
