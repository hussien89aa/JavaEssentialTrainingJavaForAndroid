package mainpackage;

public class myThreadMain {

	public static void main(String[] args) throws InterruptedException{
		myThread t=new myThread("t1");
		 t.start();
		 
		
		myThread t2=new myThread("t2");
		t2.start();
		System.out.println("thread is working");
		
	//	Thread.sleep(6000);
//t.IsRuning=false;
		
		//runable
		/*
		myRunable r=new myRunable("runable");
		Thread tr= new Thread(r);
		tr.start();
*/
	}
}
