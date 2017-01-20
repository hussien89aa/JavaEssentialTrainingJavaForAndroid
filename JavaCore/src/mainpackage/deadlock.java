package mainpackage;

public class deadlock {

	public static void main(String[] args)
	
	{
		final String Passenger1="hussein";
		final String Passenger2="Jena";
		Thread bus1=new Thread(){
			@Override
			public void run(){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (Passenger1) {
			
					System.out.println("bus 1 is locked p1");
					try{
					Thread.sleep(1000);
					}catch(Exception ex){}
					synchronized (Passenger2) {
						System.out.println("bus 1 is locked p2");
					}
				}
			}
		};
		
		Thread bus2=new Thread(){
			@Override
			public void run(){
				synchronized (Passenger2) {
					System.out.println("bus 1 is locked p2");
					try{
					Thread.sleep(1000);
					}catch(Exception ex){}
					synchronized (Passenger1) {
						System.out.println("bus 1 is locked p1");
					}
				}
		 
			}
		 
		};
		
		bus1.start();
		bus2.start();
		
	}
}
