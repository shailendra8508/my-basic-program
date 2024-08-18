package com.assignment;
 class Register{
	 void login(String email) {
		 System.out.println("Login with email");
	 }
 }
public class Assignment43 extends Register{
    void login() {
    	super.login("shailendra.htw@gmail.com");
    	System.out.println("Login with mobile");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment43 ob= new Assignment43();
		ob.login();
		 
	}

}
