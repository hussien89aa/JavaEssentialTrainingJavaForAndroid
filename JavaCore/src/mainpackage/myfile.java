package mainpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class myfile {

	static Scanner reader=new Scanner(System.in);
	static Scanner reader1=new Scanner(System.in);
	public static void main(String[] args){

		System.out.println("1- to write\n 2- to read");
		int op=reader.nextInt();
		switch(op){
		case 1: // write
			System.out.println("enter to save to file");
			String text= reader1.nextLine();
			FileWriterOn(text);
			break;
			
		case 2: // read
			FileReaderOn();
			break;
		}
		
		//
		
		
	}
	static void FileReaderOn(){
		try{
		FileReader fin=new FileReader( "test.txt");
		int c;
		while((c=fin.read( ))!=-1 ){
			System.out.print((char) c);
		}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	static void FileWriterOn(String str){
		try
		{
		FileWriter fo=new FileWriter("Recent_stable_dev_version.txt",true);
		fo.write(str +"\n");
		fo.close();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
