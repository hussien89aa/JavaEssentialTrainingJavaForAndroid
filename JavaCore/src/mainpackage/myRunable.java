package mainpackage;

public class myRunable implements Runnable {

	boolean IsRuning=true;
	 String name;
	 public myRunable(String name){
		 this.name=name;
		 System.out.println(name);
	 }
		@Override
		public void run(){
		// here your code
		int count=0;
		while(IsRuning){
			System.out.println(name+ ":"+count);
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
