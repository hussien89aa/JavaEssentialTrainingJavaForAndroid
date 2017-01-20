package mainpackage;

import java.util.ArrayList;

public class mycollections {
	public static void main(String[] args){
	 ArrayList<String>	ar=new  ArrayList<String>();
	 ar.add("developer");
	 ar.add("tester");
	 ar.add("manager");
	 
	 ar.remove(1);
	 for (String st: ar)
	 System.out.println(st);
	 
	 // array class
	 ArrayList<employee> emp= new  ArrayList<employee>();
	 emp.add(new employee("hsssein ",27));
	 emp.add(new employee("jena ",1));
	 emp.add(new employee("laya ",1));
	 for (employee st: emp)
		 System.out.println(st.age);
	}
	static class employee{
		String name;
		int age;
		public employee(String name,int age){
			this.name=name;
			this.age=age;
		}
	}
}
