package com.assignment;

public class Prime_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=7;
if(num==0||num==1) {
	System.out.println("Number is not prime");
	
}
else 
{
	int f=0;
	for(int i=2;i<num;i++) 
	{
		if(num%i==0) {
			System.out.println(num+"number s not prime");
			f=1;
			break;
		}
	}
	if(f==0) {
		System.out.println(num+ " Number is prime number");
	}
	
}
	}

}
