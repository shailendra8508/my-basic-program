package com.assignment;

public class Assignment51 {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment51 ob= new Assignment51();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
	}

}
