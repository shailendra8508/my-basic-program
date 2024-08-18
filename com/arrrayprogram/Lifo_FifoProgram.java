package com.arrrayprogram;

import java.util.Scanner;

public class Lifo_FifoProgram {
	
	
	public void GetData() {
		
		int []a= new int[5];
		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter the 5 input");
		for (int k=0; k<=4; k++) {
			a [k]=sc.nextInt();
		}
		System.out.println("Data display in lifo form");
		for (int j=4; j>=0;j--) {
			System.out.println(a[j]);
		}
	}
	
	public static void main (String[]args) {
		Lifo_FifoProgram ob = new Lifo_FifoProgram();
		ob.GetData();
		
	}

}
