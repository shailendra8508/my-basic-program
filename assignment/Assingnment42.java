package com.assignment;
class Parent_class{
	void login() {
		System.out.println("Login from mobile");
	}
}
public class Assingnment42 extends Parent_class{
void login() {
	
	System.out.println("Login from e-mail");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assingnment42 ob = new Assingnment42();
		ob.login();
	}

}
