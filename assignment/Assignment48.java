package com.assignment;
interface Marksheet{
	void allSubjectNumber();
}
public class Assignment48 implements Marksheet{
	@Override
	public void allSubjectNumber() {
		// TODO Auto-generated method stub
		System.out.println(("all marks 750"));
	}
void city() {
	System.out.println("NCR city");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment48 ob = new Assignment48();
		ob.city();
		ob.allSubjectNumber();
	}
	

}
