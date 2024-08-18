package array_programs;

import java.util.Scanner;

public class Arrays_Average_Findings {
	static double average;
	static int sum;
	void Finding_Average_Of_Arrays() {
		 int input []=new int [2];
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Please enter the  inputs to find the average");
		  for (int i=0; i<=input.length-1;i++) {
			  input[i]=sc.nextInt();
			  sum=sum+input[i];
		  }
		  average=sum/input.length;
		  System.out.println(average);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays_Average_Findings ob = new Arrays_Average_Findings();
		ob.Finding_Average_Of_Arrays();
	}

}
