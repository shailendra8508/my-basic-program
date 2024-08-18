package array_programs;

import java.util.Scanner;

public class Find_Charecter_repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
Scanner sc= new Scanner(System.in);
System.out.println("Please enter the string");
  String str=sc.next();
  System.out.println("Please enter the character to find how many time the charecter repeted in the string");
  char c=sc.next().charAt(0);
  for(int i=0; i<=str.length()-1;i++) {
	  char c1=str.charAt(i);
	  if(c==c1) {
		  count++;
	  }
  }
  System.out.println(c +" count is->" +count);
	}

}
