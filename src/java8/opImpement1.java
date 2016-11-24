package java8;

public class opImpement1 implements operations {
 int x=10;
  int y =15;
	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+ y;
	}

	@Override
	public int GetX() {
		// TODO Auto-generated method stub
		return x;
	}
	public static void main(String[] args){
	 
	System.out.println( new opImpement1().GetX());	
		new opImpement1().Display();
	 
	}

}
