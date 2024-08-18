package com.arrrayprogram;

import java.util.Scanner;

public class CountCharacter {
	
	void getData(String input, char input1) {
		//Input =ajaysingh;
		char[]c=input.toCharArray();
		//c[]=a,j,a,y,s,i,n,g,h
		for(int i=0; i<c.length-1; i++)
		{
			 	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CountCharacter ob = new CountCharacter();
Scanner sc = new Scanner (System.in);
System.out.println("Plase enter the input");
  String input=sc.next();
  System.out.println("Please enter the char input");
  char input1=sc.next().charAt(0);
  ob.getData(input, input1);
	}

}
