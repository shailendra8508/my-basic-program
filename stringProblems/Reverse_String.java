package stringProblems;

import java.util.Arrays;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "my name is shialendra singh";
String reverse="";


for (int i=name.length()-1;i>=0;i--) {
	
	char  c1=name.charAt(i);
	reverse= reverse+c1;
	
}
System.out.println((reverse));

	}

}
