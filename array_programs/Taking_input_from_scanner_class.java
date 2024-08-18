package array_programs;

import java.util.Arrays;
import java.util.Scanner;



public class Taking_input_from_scanner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno[]= new int[5];
		Scanner sc= new Scanner(System.in);
         System.out.println("Please enter the 5 students roll no");
   
   for(int i=0; i<=rollno.length-1;i++) {
	 rollno[i] =sc.nextInt();
   }
   System.out.println("5 students roll no is " + Arrays.toString(rollno));
	}

}
