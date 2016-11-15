package mainpackage;

public class FunSimple {

	float sum(float n1, float n2){
		float sum=n1+n2;
		return sum;
	}
	
	void Draw(){
		//Draw
				for (int i=0;i<10;i++)
				 {
				 System.out.println("*");
				  for(int j=i;j>=0;j--)
				   System.out.print("-");	
				 }
	}
	
	
	public static void main(String[] args){
		// same
		float r=new FunSimple().sum(9, 9);
		System.out.println("sum="+ r);
		
		  r=new FunSimple().sum(9, 12);
		System.out.println("sum="+ r);
		//Draw
		new FunSimple().Draw();
		new FunSimple().Draw();
		new FunSimple().Draw();
		new FunSimple().Draw();
		new FunSimple().Draw();
		
		
		 
	}
}
