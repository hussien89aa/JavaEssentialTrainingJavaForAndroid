package java8;

public interface operations {

	int sum(int x, int y);
	
 int GetX();
	
default	void Display(){
		System.err.println("x:"+ GetX());
	}
	
static	void DisplayY(){
	System.err.println(" hellow from static");
}
	 
}
