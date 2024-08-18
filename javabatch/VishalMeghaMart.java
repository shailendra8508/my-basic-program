package javabatch;

import java.util.Scanner;

public class VishalMeghaMart 
{
String name, productname;
long mobile;
float productamnt,gst,total;


	public void Getdetails() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleas enter your name");
		name=sc.next();
		System.out.println("Please enter the Mobile number");
		mobile=sc.nextLong();
		System.out.println("Please enter the product name");
		productname=sc.next();
		System.out.println("Please enter he product amount");
		productamnt=sc.nextFloat();
		gst =(productamnt*18)/100;
		total = gst + productamnt; 
		System.out.println("Vishal megha mart");
		System.out.println("Costumer name is"+name);
		System.out.println("Costumer mobile number is"+mobile);
		System.out.println("productname is "+productname);
		System.out.println("Product amount is" +productamnt);
		System.out.println("GST 18% is"+gst);
		System.out.println("Total payable amount is"+total);
		
	}
	
	
	public static void main (String[]args) 
	{
		VishalMeghaMart ob= new VishalMeghaMart();
		ob.Getdetails();
	}
}
