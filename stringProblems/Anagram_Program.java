package stringProblems;

import java.util.Arrays;

public class Anagram_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="cat";
String s1="act";
char c[]=s.toCharArray();
char c1[]=s1.toCharArray();
if(c.length==c1.length) {
	System.out.println("This is anagram but needs to check");
}


Arrays.sort(c);
Arrays.sort(c1);
boolean ans=Arrays.equals(c, c1);
if(ans==true) {
	System.out.println("given string is anagram of each other");
}

	}

}
