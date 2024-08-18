package com.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Please neter the inputs");
try {
int a=sc.nextInt();
double d=sc.nextDouble();
float f= sc.nextFloat();
boolean b =  sc.nextBoolean();
}
catch(InputMismatchException a1)
{
	System.out.println("Please neter the right input");
}
	}

}
