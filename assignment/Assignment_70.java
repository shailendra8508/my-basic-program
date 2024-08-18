package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int input[]=new int[5];
	Scanner sc= new Scanner(System.in);
	System.out.println("please enter 5 input");
	for (int i=0; i<=input.length-1;i++) {
		input[i]= sc.nextInt();
	}
	System.out.println(Arrays.toString(input));
}
	
}
