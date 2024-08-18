package stringProblems;

import java.util.Arrays;

public class Reversing_array {
public static void main (String[]args) {
	int arr[]= new int[3];
	arr[0]=12;
	arr[1]=13;
	arr[2]=15;
	int reverse_arr[]=new int[arr.length];
	int k=0;
	for(int i=arr.length-1; i>=0 ;i--) {
		reverse_arr[i]=arr[k];
		k++;
	}
	System.out.println(Arrays.toString(reverse_arr));
}
}
