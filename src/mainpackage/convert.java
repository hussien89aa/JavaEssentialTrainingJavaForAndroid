package mainpackage;

public class convert {

	public static void main(String[] args)
	{
		int age=27;
		double salary=3.5;
		boolean isTrue=true;
		String rate="3.5";
		
		// convert to string
		String NewSalary=String.valueOf(salary) ;
		String NewAge=String.valueOf(age) ;
		String NewisTrue=String.valueOf(isTrue);
		
		//convert to integer
		int Newrate=Integer.parseInt(rate) ;
		//int Newrate=(int) rate  ;
		int Newsalary=(int) salary;
		
		//convert to double
		double newrate=Double.parseDouble(rate);
		double NewAgeDouble= (double) age;
	}
}
