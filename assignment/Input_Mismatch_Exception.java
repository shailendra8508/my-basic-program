package com.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_Mismatch_Exception {
	void taking_Input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter all data type inputs");
		try {
			System.out.println("Please enter your name");
			 String a= sc.next();//this can not be in exception because string can take all type data
			 System.out.println("please enter your age");
			 int b= sc.nextInt();
			 System.out.println("please enter your hindi marks");
			 byte c= sc.nextByte();
			 System.out.println("Please enter your total marks in percentage");
			 float d=sc.nextFloat();
			 System.out.println("Please enter your mobile number");
			 long e=sc.nextLong();
			 System.out.println("Please enter your yearly salary");
			 double f=sc.nextDouble();
			 System.out.println("Please enter your per month salary");
			 short g= sc.nextShort();
			
			 
		}
		catch(InputMismatchException ex) {
			System.out.println("please enter right value");
		}
	}
	
		
		
			
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input_Mismatch_Exception ob = new Input_Mismatch_Exception();
		ob.taking_Input();
	}

}
