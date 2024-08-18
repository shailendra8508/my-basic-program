package com.assignment;

import java.util.Scanner;

public class Assignment32 {
	static Scanner sc= new Scanner(System.in);
	
void addition() {
	System.out.println("Please neter 2 numbers for addition");
	   int   a= sc.nextInt();
	  int    b=sc.nextInt();
	  System.out.println(a+b);
}
void substraction() {
	System.out.println("Please neter 2 nubers for substraction");
	  int   c=sc.nextInt();
	   int  d=sc.nextInt();
	   System.out.println(c-d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment32 ob= new Assignment32();
		ob.addition();
		ob.substraction();
		
	}

}
