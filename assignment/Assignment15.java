package com.assignment;

public class Assignment15 {
	 static void add(int a) {
   	  System.out.println(a);
     }
	static  void add(int a, int b) {
		System.out.println(a+b);
		 
	 }
	Assignment15(int a){
		System.out.println(a);
	}
	Assignment15(int a, int b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     add(10);
     add(10,20);
     Assignment15 ob = new Assignment15(10);
     Assignment15 ob1 = new Assignment15(5,10);
	}

}
