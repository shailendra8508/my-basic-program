package com.arrrayprogram;

import java.util.Scanner;

public class RepetedCharacter {
	String input1;
	public void CountCharacter(String input, char input1) { 
		int count=0;
		
			//input= Shristysingh.
			//Here we need to break the string in the character.
			char[] c=input.toCharArray();
			//after breaking the string into character the string will store in the input 
			//[s,r,i,s,t,y,s,i,n,g,h]
			for (int i=0; i<c.length-1; i++) {
				if (c[i]==input1) {
					count++;
				}
				
			}
			
			System.out.println(input1+ " = " + count);	
	}
	
	public static void main (String []args) {
		RepetedCharacter ob = new RepetedCharacter();
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the input");
		String input = sc.next();
		System.out.println("Please enter the character type input");
		char input1 = sc. next().charAt(0);
		ob.CountCharacter(input, input1);
		
	}

}
