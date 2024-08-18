package com.assignment;
interface facebookLogin{
	void login_by_Email();
}
interface WhatsAppLogin{
	void login_by_mobile();
}
public class Assignment49 implements facebookLogin,WhatsAppLogin {
	@Override
	public void login_by_mobile() {
		// TODO Auto-generated method stub
		System.out.println(("7903280515"));
	}

	@Override
	public void login_by_Email() {
		// TODO Auto-generated method stub
		System.out.println("shailedrahtw1@gmail.com");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment49 ob = new Assignment49();
		ob.login_by_Email();
		ob.login_by_mobile();
	}

	
}
