package mainpackage;

public class innerClass {
  
	static class Animal{
		String Name;
		String Voice;
	}
	
	public static void main(String[] args){
		Animal animal=new Animal();
		animal.Name="Monkey";
		animal.Voice="hehe";
		System.out.println(animal.Name);
	}
	
	void call(){
	
	}
}
