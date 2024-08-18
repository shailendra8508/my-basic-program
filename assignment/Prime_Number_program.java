package com.assignment;

import java.util.Scanner;

public class Prime_Number_program {
	
public static void main(String []args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("please neter the number");
	  int num=sc.nextInt();
	  if(num==1||num==0) {
		  System.out.println(num +" is not prime.");
	  }
	  else {
		  int f=0;
		  for(int i=2;i<=num;i++) {
			  if(num%i==0) {
				  System.out.println("Number is not prime number");
				  f=1;
				  break;
			  }
		  }
		  if(f==0) {
			  System.out.println("number is prime");
		  }
	  }
}
}
