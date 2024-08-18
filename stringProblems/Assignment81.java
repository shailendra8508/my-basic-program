package stringProblems;

import java.util.Arrays;

public class Assignment81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
int arr[]= {12,13,18,19,20};
int reverse_arr[]=new int[arr.length];
for(int i=arr.length-1;i>=0;i--) {
	reverse_arr[i]=arr[k];
	k++;
}
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.toString(reverse_arr));
	}

}
