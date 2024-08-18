package array_programs;

import java.util.Scanner;

public class Armstrong_program {
	
	public void getArmstrong(int num) {
		int temp=num;
		int sum=0;
		for(;num>0;) {
			int a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
		}
		if(temp==num) {
			System.out.println(temp +" is armstrong number");
		}
		else {
			System.out.println("not armstrong");
		}
	}
public static void main (String[]args) {
	Armstrong_program ob= new Armstrong_program();
	Scanner sc= new Scanner(System.in);
	   System.out.println("Please netr number to check aremstrong");
	   int num=sc.nextInt();
	   ob.getArmstrong(num);
}
}
