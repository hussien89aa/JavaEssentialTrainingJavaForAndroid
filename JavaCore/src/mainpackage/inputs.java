package mainpackage;
import java.util.Scanner;


public class inputs {
	static Scanner reader=new Scanner(System.in);
	static Scanner reader1=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter Name:");
		String name= reader.nextLine();
		System.out.print("Enter Age:");
		int age=reader.nextInt();
		System.out.print("Enter Salary:");
		double Salary=reader.nextDouble();
		System.out.print("Enter Gender:");
		String input=  reader1.nextLine();
		char Gender=input.charAt(0);
	 
		System.out.println("name:"+ name);
		System.out.println("age:"+age);
		System.out.println("Salary:"+ Salary);
		System.out.println("Gender:"+ Gender);
	}
}
