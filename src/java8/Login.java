package java8;

public class Login {
String UserName;
String Password;
public Login(String UserName,String Password){
	this.UserName=UserName;
	this.Password=Password;
}
 Boolean IsWeak(){
	 if (Password.length()<=3)
		 return true;
	 else
		 return false;
 }
}
