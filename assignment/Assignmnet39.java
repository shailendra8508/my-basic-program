package com.assignment;
class Set_URL{
	Set_URL(){
		System.out.println("Set the url");
	}
}
class Launch_Google extends Set_URL{
	Launch_Google(String Google_chrome){
		System.out.println("Launch the google");
	}
}
public class Assignmnet39 extends Launch_Google{
	Assignmnet39(){
		super("https://google.com");
		System.out.println("Assignment39");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignmnet39 ob= new Assignmnet39();
	}

}
