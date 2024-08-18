package com.assignment;

public class Assignmnet68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="madam";

String reverse="";
for (int i =str.length()-1; i>=0; i--) {
	char c=str.charAt(i);
	reverse =reverse+c;
}
System.out.println(reverse);
boolean result =str.equals(reverse);
System.out.println(result);
if (result=true) {
	System.out.println("is palindrom");
}
	}

}
