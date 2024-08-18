package array_programs;

import java.util.Arrays;

public class Anagram_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="cat";
String s2="apt";

if(s1.length()==s2.length()) {
	System.out.println("String s1 and String s2 is angram but need to check ");
	
}
char c[]=s1.toCharArray();
char c1[]=s2.toCharArray();

Arrays.sort(c);
Arrays.sort(c1);

boolean b1=Arrays.equals(c, c1);
if(b1==true) {
	System.out.println("Given 2 string id angram of ecah other");
}
else {
	System.out.println("not anagram");
}

	}

}
