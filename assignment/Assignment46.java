package com.assignment;
class Super_mostclass{
	void dog() {
		System.out.println("Dog is barking");
	}
	void cat() {
		System.out.println("cat is mews");
	}
}
abstract class cal extends Super_mostclass{
	abstract void mul();
	void substraction() {
		System.out.println("This is substraction method");
	}
}
public class Assignment46 extends cal {
	void mul() {
		// TODO Auto-generated method stub
		System.out.println("This is multiplication method");
	}
 void add() {
	 System.out.println("this is additio method");
 }
 void sub() {
	 System.out.println("this is substraction method");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46 ob = new Assignment46();
		ob.sub();
		ob.mul();
	}
	
	

}
