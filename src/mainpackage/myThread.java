package mainpackage;

import java.util.concurrent.SynchronousQueue;

public class myThread extends Thread {
 boolean IsRuning=true;
  String name;
 public myThread(String name){
	 this.name=name;
	 System.out.println(name);
 }
	@Override
	public void run(){
		
		display();
 
	 
	}
 
 void display(){ //shared
		int count=0;
		while(count<10){
		 
			System.out.println(name +":"+   count);
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	 
	 
	}

  
}
