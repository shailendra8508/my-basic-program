package com.arrrayprogram;

import java.util.Scanner;

public class Find_letter_Type {
	
	public void GetletterType()
	{
		char []a = new char[5];
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the 5 character type input");
		
		for (char j=0; j<=4; j++) {
			a[j]= sc.next().charAt(0);
		}
		System.out.println("Finding the vowel and consonent letter");
		for (char j=0; j<=4; j++ ) {
			if (a[j]=='a' || a[j]=='e' || a[j]=='i' ||a[j]=='o' ||a[j]=='u') {
				System.out.println(a[j] +"is vowel");
			}
			else {
				System.out.println(a[j] + "is consonent");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_letter_Type ob = new Find_letter_Type();
		ob.GetletterType();
	}

}
