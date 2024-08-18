package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Assending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = new int [5];
    Scanner sc= new Scanner(System.in);
    System.out.println("Please enter the numbers");
    for(int i=0; i<=input.length-1;i++) {
                input[i]=sc.nextInt();
                // [23,24,25,26,27]
    }
    Arrays.sort(input);
    System.out.println(Arrays.toString(input));
    
	}

}
