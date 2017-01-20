package mainpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeFile {

	public static void main(String[] args) {
	 
	 
		Employee ep=new Employee();
		ep.name="hussein";
		ep.age=27;
		try{
		FileOutputStream fo=new FileOutputStream("employee.txt");
		ObjectOutputStream out=new ObjectOutputStream(fo);
		out.writeObject(ep);
		out.close();
		fo.close();
		}catch(Exception ex){}
		 
		Employee emp=null;
		try{
			FileInputStream f1=new FileInputStream("employee.txt");
			ObjectInputStream in=new ObjectInputStream(f1);
			emp=(Employee)in.readObject();
			in.close();
			f1.close();
			System.out.println(emp.name);
			System.out.println(emp.age);
			}catch(Exception ex){}
	}
}
