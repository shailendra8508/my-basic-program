package com.assignment;

import java.util.Scanner;

public class Prime_number {
public static void main (String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Pleas enter the number");
	int num=sc.nextInt();
	int count=0;
	for(int i=1; i<=num;i++) 
	{
		if(num%1==0) {
			count++;
		}
		
	}
	if(count==2) {
		System.out.println(num+"Number is prime");
		
	}
	else {
		System.out.println(num+"number is not prime");
	}
}
}
