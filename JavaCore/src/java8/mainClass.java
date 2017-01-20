package java8;

 
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//myRunable  newmyRunable= new myRunable();
		Runnable newmyRunable= ()-> {
			System.out.println("thread is working");
		};
		Thread t= new Thread(newmyRunable);
		t.start();
	}
	
 	
	 
 

}
