package com.assignment;
class Superclass{
	void login() {
		System.out.println("plase loging by mobile number");
	}
}
public class Assignment42 extends Superclass{

	void login() {
		System.out.println("login from email");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment42 ob = new Assignment42();
		ob.login();
	}

}
