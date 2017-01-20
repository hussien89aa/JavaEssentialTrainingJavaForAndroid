package java8;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Stringss {
	public static void main(String[] args) {
		String[]  names= {"hussein","Jena","laya","Rana"};
		String allNames="{"; // immutable// cannot be update
		// mutable// could be updated
		StringJoiner sj= new StringJoiner(",","{","}"); // mutable
		sj.setEmptyValue("no value");
		for (String name : names) {
			//allNames+=name +",";
			sj.add(name);
		}
		allNames+="}";
		System.out.println(sj);
	}
}
