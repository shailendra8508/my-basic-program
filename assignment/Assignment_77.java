package com.assignment;

public class Assignment_77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= new int[5];
arr[0]=13;
arr[1]=14;
arr[2]=15;
arr[3]=16;
arr[4]=17;
int no_to_check=15;
for(int i=0; i<=arr.length-1;i++) {
	if(arr[i]==no_to_check) {
		System.out.println("no 15 is present in array");
		System.out.println("no 15 is present at indexing-> "+i);
	}
	
}

	}

}
