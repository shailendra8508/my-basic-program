package com.assignment;

public class Constuctor_Program {
	
	Constuctor_Program(){
		
		int a,b;
		a=10;
		b=20;
		System.out.println(a+b);
		
	}
	Constuctor_Program(int c){
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constuctor_Program ob=new Constuctor_Program();
		Constuctor_Program ob1=new Constuctor_Program(20);
	}

}
