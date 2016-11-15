package mainpackage;

import java.util.Scanner;

public class exceptions {

	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args){
	  try{
		  //block
			int x=reader.nextInt();
			System.out.println(x);
	  }
	  catch(Exception ex){
		  System.out.println(ex.getMessage());
	  }
	  finally {
		System.out.println("prossed");  
	  }
		System.out.println("end file");
	}
}
