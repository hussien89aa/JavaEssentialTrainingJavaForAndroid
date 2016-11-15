package mainpackage;

import java.util.Scanner;

public class switchFile {
	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("enter index:");
		int index=reader.nextInt();
		
		switch(index)
		{
		case 1: //block of code
			System.out.println(" he is male");
		break;
		case 2:
			System.out.println("she is female");
		break;
		default:
			System.out.println("unknown");
			break;
		
		}
	}
}
