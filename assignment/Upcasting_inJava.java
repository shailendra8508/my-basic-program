package com.assignment;


class UP{
	void city() {
		System.out.println("Delhi is ncr city");
	}
}
public class Upcasting_inJava extends UP{
	
	void rural() {
		System.out.println("This is rural");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        UP d1= new Upcasting_inJava();
        d1.city();
       // d1.rural();  here we can not call the method of the child class because
        //we have converted the child class object in to the super class object.
	}

}
