package mainpackage;

public class CarTruckMain {
	public static void main(String[] args){
		CarTruck.Owner="Smith";
		CarTruck cartrack=new CarTruck();
		cartrack.Model=2016;
		cartrack.SetHasTruck(true);
		cartrack.MilesDrive=100;
		cartrack.Price=23330;
		cartrack.Type="GSM";
		System.out.println("Price:"+cartrack.GetPrice());
		cartrack.GetOwnder();
	}
}
