package com.assignment;

public class Assignment_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="50cent";
int count_of_digit=0;
   char c[]=str.toCharArray();
   for (int i=0; i<=str.length()-1; i++) {
	   if(Character.isDigit(c[i])) {
		   count_of_digit++;
	   }
	  
   }
   System.out.println(count_of_digit);

	}

}
