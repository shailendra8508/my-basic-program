package array_programs;

import java.util.Arrays;

public class Copy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]=new int[5];
 arr[0]=14;
 arr[1]=23;
 arr[2]=34;
 arr[3]=32;
 arr[4]=45;
 int copied_array[]=new int[arr.length];
 
 for(int i=0; i<=arr.length-1;i++) {
	 copied_array[i]=arr[i];
 }
 System.out.println(Arrays.toString(copied_array));
 System.out.println(Arrays.toString(arr));
 boolean result=Arrays.equals(arr, copied_array);
 if(result==true) {
	 System.out.println("both array is equals to each othr");
 }
	}

}
