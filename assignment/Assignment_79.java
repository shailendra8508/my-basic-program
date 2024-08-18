package com.assignment;

import java.util.Arrays;

public class Assignment_79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[3];

arr[0]=12;
arr[1]=13;
arr[2]=14;
int copied_arr[]=new int[3];
for(int i=0; i<=arr.length-1;i++) {
	copied_arr[i]=arr[i];
}
System.out.println(Arrays.toString(copied_arr));
 System.out.println(Arrays.toString(arr));
 boolean result=Arrays.equals(arr,copied_arr);
 System.out.println("result");
	}

}
