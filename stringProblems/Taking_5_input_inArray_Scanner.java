package stringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Taking_5_input_inArray_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Please neter 5inputs");
for(int i=0; i<=arr.length-1; i++) {
	arr[i]=sc.nextInt();
}
System.out.println(Arrays.toString(arr));
	}

}
