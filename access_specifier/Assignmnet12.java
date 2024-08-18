package access_specifier;

import java.util.Scanner;

public class Assignmnet12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[]= new int[5];
  Scanner sc= new Scanner(System.in);
  System.out.println("please enter the 5 input to find the even number");
  for(int i=0; i<=arr.length-1;i++) {
	     arr[i]=sc.nextInt();
	     
  }
  for(int i=0; i<=arr.length-1;i++) {
	  if(arr[i]%2==0) {
	    	System.out.println(arr[i]+" is even number");
	     }
  }
	}

}
