package mainpackage;

public class localGlobal {
	   double pi=3.5; //global
	float sum(float n1, float n2)
	{  double newPI=pi*4;
		float sum=n1+n2;   //local
		return sum;
	}
 
	
	public static void main(String[] args){
		  
				float r=new FunSimple().sum(9, 9) ;
				System.out.println("sum="+ r);
				int sum=0;
				for(int i=0;i<10;i++){
					  sum=i; //local
				}
				System.out.println(sum);
	}
}
