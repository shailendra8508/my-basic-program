package com.assignment;

import java.util.Scanner;

public class Assignment35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Circumfernce_of_circle;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the vlue of radius");
		int radius= sc.nextInt();
		Circumfernce_of_circle=2*Math.PI*radius;
		System.out.println(Circumfernce_of_circle);
	}

}
