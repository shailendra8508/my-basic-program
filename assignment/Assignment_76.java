package com.assignment;

public class Assignment_76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[4];
arr[0]=12;
arr[1]=13;
arr[2]=14;
arr[3]=15;
int sum=0;
double average=0;
for(int i=0; i<=arr.length-1;i++) {
	sum=sum+arr[i];
}
average=sum/4;
System.out.println(average);

	}

}
