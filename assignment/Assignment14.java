package com.assignment;

public class Assignment14 {
	Assignment14(){
		System.out.println("This is non prameterised constructor");
	}
	Assignment14(int a, int b){
		System.out.println("This is parametrised constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment14 ob = new Assignment14();
		Assignment14 ob1= new Assignment14(10,30);
	}

}
