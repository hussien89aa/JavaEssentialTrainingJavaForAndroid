package java8;

import java.util.ArrayList;
import java.util.Iterator;

public class UserLoginInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Login> userLogin= new  ArrayList<Login>();
 userLogin.add(new Login("hussein","12345"));
 userLogin.add(new Login("jena","dsffd"));
 userLogin.add(new Login("Laya","dsfsdf"));
 userLogin.add(new Login("Rana","dfusd"));
 
 // for each
 System.out.println("for each");
 for (Login Singel_login : userLogin) {
	System.out.println("User name:"+ Singel_login.UserName);
	System.out.println("Password:"+ Singel_login.Password);
}
 // interator
 System.out.println("interator");
 Iterator<Login > i =userLogin.iterator();
 while(i.hasNext()){
	 //System.out.println(i.next());
	 Login login= i.next();
	 System.out.println("User name:"+ login.UserName);
		System.out.println("Password:"+ login.Password);
 }
 // Lamdba do
 System.out.println("Lambda");
 userLogin.forEach((loginInfo)->
 {
	 System.out.println("User name:"+ loginInfo.UserName);
		System.out.println("Password:"+ loginInfo.Password);
	 
 });
	}

}
