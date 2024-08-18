package conditional_statement;

import java.util.Scanner;

public class GreatestNumber {
	double number1,nibmer2,number3;
	
	
	
	
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter number");
		double number1=sc.nextDouble();
		double number2=sc.nextDouble();
		double number3=sc.nextDouble();
		
		double greatestnumber=number1;
		
		if (number2>greatestnumber) {
			greatestnumber=number2;		{
				
			}
		
			if (number3>greatestnumber) {
				greatestnumber=number3;
			}
		System.out.println("greatest number is" + greatestnumber);
	}
	
	
	
		}

}
	
	
