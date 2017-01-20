package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class UserLoginWeekPassword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Login> userLogin= new  ArrayList<Login>();
 userLogin.add(new Login("hussein","123"));
 userLogin.add(new Login("jena","dsffd"));
 userLogin.add(new Login("Laya","dsfsdf"));
 userLogin.add(new Login("Rana","dsa"));
 
 Predicate<Login> predRules=(p) -> p.IsWeak()== true ;
 
 // Lamdba do
 System.out.println("people with week password");
 userLogin.forEach((loginInfo)->
 {
	 if(predRules.test(loginInfo)){
	 System.out.println("User name:"+ loginInfo.UserName);
		System.out.println("Password:"+ loginInfo.Password);
	 }
 });
	}

}
