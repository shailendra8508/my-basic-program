package com.assignment;
class Calculate{
	int a=50;
	int b=30;
	void sub() {
		System.out.println(a+b);
	}
}
public class Assignment38 extends Calculate {
	
static void add() {
	int a=10;
	int b=30;
	System.out.println(a+b);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		Assignment38 ob = new Assignment38();
		ob.sub();
	}

}
