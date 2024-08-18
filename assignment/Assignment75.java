package com.assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Assignment75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String input = "cat";
  String input1= "act";
  
 if (input.length()==input1.length()) {
	 System.out.println("this is anagram but needs to check");
 }
 
 //here we will short the input by changing in array because arrys has short method
 char c1[]=input.toCharArray();
 char c2[]=input1.toCharArray();
 
     Arrays.sort(c1);
     Arrays.sort(c2);
     
     boolean ans=Arrays.equals(c1, c2);
     
   if (ans==true) {
	   System.out.println("It is anagram");
   }
     
  
  

  
	}

}
