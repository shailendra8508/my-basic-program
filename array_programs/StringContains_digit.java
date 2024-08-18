package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class StringContains_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
Scanner sc= new Scanner(System.in);
System.out.println("Please enter the string");
  String str=sc.next();
  char c1[]=str.toCharArray();
  System.out.println(Arrays.toString(c1));
  for(int i=0; i<=str.length()-1;i++) {
	  boolean b1=Character.isDigit(c1[i]);
	  if(b1==true) {
		  System.out.println("contains digit");
	  }
  }
  
  
  
	}

}
