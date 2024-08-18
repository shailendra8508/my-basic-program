package com.assignment;

public class ThisCalling_Statement {
	ThisCalling_Statement(int a){
		System.out.println("parametrised constructor");
	}
	ThisCalling_Statement(){
		this(10);
		System.out.println("Non parametrised constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisCalling_Statement ob = new ThisCalling_Statement();
	}

}
