package mainpackage;

public class CarTruck extends Car {
	 
	 private boolean HasTruck;
	 public void SetHasTruck(boolean HasTruck){
	  this.HasTruck=HasTruck;
	 
  }
	public CarTruck(){
		super("BMW",2016,10000,5);
		System.out.println(" Constrcotr of car track");
	}
 	void GetOwnder(){
		System.out.println("Owner:"+Owner);
		System.out.println("Price:"+ super.GetPrice()); 
	 
	}
 	
 	@Override
 	double GetPrice(){
 		//different content
 		double NewPrice=Price-(MilesDrive*50);
 		return NewPrice;
 	}
}
