package stringProblems;

import java.util.Arrays;

public class ReverseFllString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="I Learn Java";
String []words =str.split(" ");
String reversingString = " ";
for(String w :words) 
{
	String reverseword=" ";
	System.out.println(w);
	for (int i =w.length()-1; i>=0;i--) {
		reverseword=reverseword+w.charAt(i);
	}
	reversingString = reversingString+reverseword+" ";
}
System.out.println(reversingString);
	}

}
