package userinput;

import java.util.Scanner;

public class Vishalmega_mart {
	String Costumername,Productname;
	Long Mobilenumber;
	float Productamount;
	float GST,Totalpayableamount;
	
	Scanner sc=new Scanner(System.in);
	
	void Getdetails() {
		System.out.println("Enter costumer name");
		Costumername=sc.nextLine();
		System.out.println("Enter Mobile number");
		Mobilenumber=sc.nextLong();
		System.out.println("Enter Product name");
		Productname=sc.next();
		System.out.println("Enter product amount");
		Productamount=sc.nextFloat();
	GST=(Productamount*18)/100;
	Totalpayableamount=GST+Productamount;
	System.out.println("Costumername is" + Costumername);
	System.out.println("Mobile number is" + Mobilenumber);
	System.out.println("Product name is"  + Productname);
	System.out.println("Product name is" + Productname);
	System.out.println("Product amount is" +Productamount);
	System.out.println("GST added" +GST);
	System.out.println("Total payable amount is" + Totalpayableamount);
		
		
	}
	
	
	public static void main(String[]args) {
		Vishalmega_mart slip = new Vishalmega_mart();
		slip.Getdetails();
		
	}
	

}
