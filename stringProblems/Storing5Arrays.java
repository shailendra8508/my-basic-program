package stringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Storing5Arrays {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] rollno = new int[5];
       
     
       for(int i=0; i<=rollno.length-1;i--) {
    	       rollno[i]=sc.nextInt();
    	   
       }
       System.out.println(Arrays.toString(rollno));
      

	}
	}
