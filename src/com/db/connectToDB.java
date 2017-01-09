package com.db;
import java.sql.*;
import java.util.Scanner;
public class connectToDB {

	public static void main(String[] args) {
		 Connection c=null;
		 Statement stmt=null;
				 try{
					Class.forName("org.sqlite.JDBC");
					c=DriverManager.
							getConnection("jdbc:sqlite:info.db");
					System.out.println("connect successfully");
					// add users
					System.out.println("select process "
							+ "\n 1- add\n"
							+ "\n2- selection"
							+ "\n3- Delete"
							+ "\n4- update password");
					stmt=c.createStatement();				
					Scanner reader = new Scanner(System.in);
int processIndex= reader.nextInt();
switch (processIndex) {
case 1:
	//add
	Scanner usernamein = new Scanner(System.in);
	Scanner passwordin = new Scanner(System.in);
	System.out.println("enter user name:");
	String user_name=usernamein.nextLine();
	System.out.println("enter password:");
	String password=passwordin.nextLine(); 
	String SQlAdd="insert into"
			+ " admins(user_name,password) "
			+ "values('"+user_name+"','"+password+"')";

 stmt.executeUpdate(SQlAdd);
c.commit(); // add // delete/ update
stmt.close();
c.close();
System.out.println("recored is added");
	break;
case 2:
	// selection data from table
	 String SqlRead="select * from admins";
	ResultSet rs= stmt.executeQuery(SqlRead);
	System.out.println("id\tUserName\t password");
	
	while( rs.next()){
		int id= rs.getInt("id");
		String UserNameR= rs.getString("user_name");
		String passwordR=rs.getString("password");
		System.out.println(id +"\t"+ UserNameR+ "\t"+ passwordR);
	}
	rs.close();
	stmt.close();
	c.close();
	break;
	
case 3:
	// delete record
		Scanner idIn = new Scanner(System.in);
		System.out.println("enter ID:");
		int id=idIn.nextInt();
		String SQlDelete="delete from admins where id="+id;

	 stmt.executeUpdate(SQlDelete);
	 c.commit(); // add // delete/ update
	 stmt.close();
	 c.close();
	System.out.println("recored is deleted");
	break;
	
case 4:
	// update password
	Scanner idInD = new Scanner(System.in);
	Scanner passwordInD = new Scanner(System.in);
	System.out.println("enter ID:");
	int id1=idInD.nextInt();
	System.out.println("enter new password:");
	String password1=passwordInD.nextLine(); 
	String SQlupdate=
			"UPDATE admins set password='"+password1+"'"
			+ "where id="+id1;

 stmt.executeUpdate(SQlupdate);
 c.commit(); // add // delete/ update
 stmt.close();
 c.close();
System.out.println("recored is added");
	
	break;
default:
	break;
}
				
				 }catch( Exception ex){
					 System.out.println("cannot connect");
					 System.exit(0);
				 }			
				
				 
	}

}
