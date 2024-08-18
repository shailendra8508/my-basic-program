package com.assignment;

import java.util.Arrays;

public class Assignmemt81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {15,87,76,98,78};
int arr_reverse[]=new int[arr.length];

int k=0;
for(int i=arr.length-1; i>=0;i--) {
	arr_reverse[i]=arr[k];
	k++;
}
System.out.println(Arrays.toString(arr_reverse));
System.out.println(Arrays.toString(arr));
	}

}
