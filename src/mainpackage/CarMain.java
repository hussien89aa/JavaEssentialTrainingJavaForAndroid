package mainpackage;

public class CarMain {

	public static void main(String[] args){
		Car.Owner="smith";
	 Car car1= new Car("BMW",2016,10000,5);
	 double price=car1.GetPrice();
	 System.out.println("Owner:"+car1.Owner);
	 System.out.println("Car1 price:"+price);
		
	 
	 Car car2= new Car();
	   car2.Type="BMW";
	 car2.Model=2015;
	 car2.Price=9000;
	 car2.MilesDrive=15;
	 //car2.Owner="smith";
	  price=car2.GetPrice();
	  System.out.println("Owner:"+car2.Owner);
	 System.out.println("Car2 price:"+price);
	 
	}
}
