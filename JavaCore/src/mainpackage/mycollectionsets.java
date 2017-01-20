package mainpackage;

 
import java.util.ArrayList;
public class mycollectionsets {
	public static void main(String[] args){
		ArrayList<Integer> ls=new ArrayList<Integer>();
		 ls.add(1);
		 ls.add(2);
		 ls.add(4);
		 ls.add(7); //find this number using binary search
		 ls.add(8);
		 ls.add(9);
		 boolean Isfound=false;
		 int high=ls.size()-1;
		 int low=0;
		 int NumberSearch=8;
		 int mid;
 while (!Isfound){
	 mid= low+(high-low)/2;
	 if(ls.get(mid)==NumberSearch)
	 {System.out.println("we found number at index:"+ mid);
		break;
	 }
	 if(ls.get(mid)<NumberSearch)
		 low=mid;
	 if(ls.get(mid)>NumberSearch)
		 high=mid;
	  
 }
	}
}
