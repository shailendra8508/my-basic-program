package com.assignment;
abstract class Animal{
	abstract void makesound();
	void sleep() {
		System.out.println("Animal is sleeping");
	}
}
public class Assignment45 extends Animal{
	
	@Override
	void makesound() {
		// TODO Auto-generated method stub
		System.out.println("woof! woof");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment45 ob= new Assignment45();
		ob.makesound();
		ob.sleep();
	}

	

	

}
