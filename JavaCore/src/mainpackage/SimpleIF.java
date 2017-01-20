package mainpackage;

import java.util.Scanner;

public class SimpleIF {

	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("enter grade:");
		int grade=reader.nextInt();
		 // between 50-60
		if( grade>=90)
		{//block of code
			 
			System.out.println("grade is A");
		 
		}
		else if((grade>=80) && (grade<90))
				{
			System.out.println("grade is B");
				}
		else if((grade>=70) && (grade<80))
		{
	System.out.println("grade is C");
		}
		else if((grade>=50) && (grade<70))
		{
	System.out.println("grade is D");
		}
		else{
			System.out.println("is fail");
		}
		
		 
		
		System.out.println("End the grading");
		
	}
}
