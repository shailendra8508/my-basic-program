package com.assignment;

public class Assignment71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String input="50cent";
      int count_of_numbers=0;
      char c1[]= input.toCharArray();
      for (int i=0; i<=input.length()-1;i++) {
    	  
    	  if(Character.isDigit(c1[i])){
    		  count_of_numbers++;
    		  
    	  }
    	  
      }
      System.out.println(count_of_numbers);
	}
      
	
	}
