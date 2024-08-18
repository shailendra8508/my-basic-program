package com.assignment;

public class Assignment67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name ="SHailendraSingh";
       String name1= name.toUpperCase();
       String reverse="";
       for (int i=name1.length()-1; i>=0;i--) {
    	   char c=name1.charAt(i);
    	   reverse=reverse+c;
       }
        
 System.out.println(reverse);
	}

}
