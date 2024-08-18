package array_programs;

import java.util.Scanner;

public class Average_program {
public static void main (String[]args) {
	int sum=0;
	double average=0;
	int arr[]=new int[4];
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter numbers");
	for(int i=0; i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
		
	}
	for(int i=0; i<=arr.length-1;i++) {
		sum=sum+arr[i];
	}
	average=sum/arr.length;
	System.out.println(average);
	
	
	
}
}
