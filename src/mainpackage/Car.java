package mainpackage;

  public class Car {
public String Type;
protected int Model;
public double Price;
public double MilesDrive;
 static String Owner;
 Owners owners;
public Car(String Type,int Model,double Price ,double MilesDrive){
	this.Type=Type;
	this.Model=Model;
	this.Price=Price;
	this.MilesDrive=MilesDrive;
	System.out.println("Constructor 1 is create");
	owners=new Owners();
	owners.FarstName="hussein";
}
public Car(){
	System.out.println("Constructor 2 is create");
}
 
double GetPrice(){
	double NewPrice=Price-(MilesDrive*100);
	return NewPrice;
}

	
}
