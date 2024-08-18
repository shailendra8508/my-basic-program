package com.assignment;
class A{
	public void add() {
		
		System.out.println("this is addition method");
		
	}
	protected void mul() {
		System.out.println("This is mul method");
	}
	private void sub() {
		System.out.println("This is sub method");
	}
	void div() {
		System.out.println("Tis is default method");
	}
}
public class Assignment52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		A ob= new A();
		ob.add();
		ob.div();
		ob.mul();
		
	}

}
