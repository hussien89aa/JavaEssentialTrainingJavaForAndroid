package mainpackage;

public class StringFile {

	public static void main(String[] args){
		String name="hussein alrubaye";
		
		System.out.println("len:"+name.length());
		System.out.println("first char:" +name.charAt(0));
		System.out.println("last char:" +name.charAt(name.length()-1));
		System.out.println("print char:");
		for(int i=0;i<name.length();i++)
			System.out.print(name.charAt(i));
		System.out.println("print char reverse:");
		for(int i=name.length()-1;i>=0;i--)
			System.out.print(name.charAt(i));
		
		System.out.println("print words:");
		String text="he go to home in the morning";
		String[] splitdata=text.split(" ");
		for(int j=0;j<splitdata.length;j++)
			System.out.println(splitdata[j]);
	}
}
