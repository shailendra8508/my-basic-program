package com.assignment;

import java.util.Scanner;

public class Assignmnet36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for two integers
        System.out.println("Enter the first integer:");
        int num1 = scanner.nextInt(); // Read the first integer
        
        System.out.println("Enter the second integer:");
        int num2 = scanner.nextInt(); // Read the second integer
        
        // Perform the modulus operation
        int remainder = num1 % num2;
        
        // Display the result
        System.out.println("The remainder of " + num1 + " divided by " + num2 + " is " + remainder);
	}

}
