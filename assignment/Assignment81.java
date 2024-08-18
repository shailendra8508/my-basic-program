package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment81 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int input []=new int [3];
  input[0]=20;
  input[1]=24;
  input[2]=26;
  int k=0;
  int input_reverse[]=new int [input.length];
  for(int i=input.length-1;i>=0;i--) {
	  input_reverse[i]=input[k];
	  k++;
  }
  
  System.out.println(Arrays.toString(input_reverse));
  
  
	}
}
