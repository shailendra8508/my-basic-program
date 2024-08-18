package com.assignment;
interface Calculator{
	abstract void add();
	abstract void substraction();
}
abstract class Animals implements Calculator{
	abstract void dog();
	abstract void cat();
	void cow(){
		System.out.println("Cow gives milk");
	}
	void lion() {
		System.out.println("Lion roars");
	}
}
public class Assignment47 extends Animals {
	public void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void substraction() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void dog() {
		// TODO Auto-generated method stub
		System.out.println("Dog is barking");
	}
	@Override
	void cat() {
		// TODO Auto-generated method stub
		System.out.println("cat mews");
	}
void assignment1() {
	System.out.println("Please write program to print hello");
}
void assignment2() {
	System.out.println("Please write program to print markshet");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment47 ob= new Assignment47();
		ob.dog();
		ob.cat();
		ob.add();
		ob.substraction();
		ob.assignment1();
		ob.assignment2();
	}

	

}
