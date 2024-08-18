package com.assignment;

public class Assignment68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String input="civic";
   String reverse="";
   for (int i=input.length()-1; i>=0;i--) {
	   char c1= input.charAt(i);
	   reverse=reverse+c1;
   }
   boolean b=input.equals(reverse);
   System.out.println(b);
	}

}
