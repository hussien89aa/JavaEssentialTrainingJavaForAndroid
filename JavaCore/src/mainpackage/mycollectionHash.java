package mainpackage;

import java.util.HashMap;
import java.util.Map;

public class mycollectionHash {
	public static void main(String[] args){
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1,"hussein");
		map.put(4,"jena");
		map.put(5555,"laya");
		System.err.println(map.get(1));
		for(Map.Entry m:map.entrySet()){
			System.err.println("key:"+ m.getKey() + ",value:"+ m.getValue());
		}
		map.put(1,"hussein alrubaye");
		System.err.println(map.get(1));
		map.remove(1);
	}
}
