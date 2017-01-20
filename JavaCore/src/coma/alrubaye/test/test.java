package coma.alrubaye.test;

import java.util.Scanner;

public class test {
	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("enter number:");
		 double Number=reader.nextDouble();
		 int Round=(int)Number;
		 if((Number-Round)>=0.5)
			 Round=Round+1;
		 System.out.println("Round:"+Round);
	
	int[][] a= new int[5][4];
	a[1][2]=11;
	 System.out.println(	a[1][2]);
	}
}
