package mainpackage;

public class StudentsMain {
	public static void main(String[] args){
		Students st=new Students("Hussein",Gender.Male);
		System.out.println("name:"+ st.FirstName);
		System.out.println("Gender:"+ st.gender);
	}
}
