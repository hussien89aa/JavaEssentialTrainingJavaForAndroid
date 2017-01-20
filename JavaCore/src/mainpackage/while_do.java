package mainpackage;

public class while_do {
public static void main(String[] args){
	int i=100;
		do
		{ //block of code
		//System.out.println("count:"+ i);
		if( i % 4==0)
			System.out.println("mode by 4 is:"+ i);
		
		i=i+1;
		}while(i<100);
		System.out.println("app is done"); 
	}
}
