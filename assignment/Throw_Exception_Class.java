package com.assignment;

public class Throw_Exception_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   int a=1/0;
    	   System.out.println(a);
       }
       catch(ArithmeticException a1) {
    	   System.out.println("Handle the exception");
       }
	}

}
