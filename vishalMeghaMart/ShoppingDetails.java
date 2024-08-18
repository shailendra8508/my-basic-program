package vishalMeghaMart;

import java.util.Scanner;

public class ShoppingDetails {
	String ProductName;
	float ProductPrice,Gst,TotalPayableAmount;
	int ProductAmount;
	Scanner sc = new Scanner(System.in);
	public void Slip(){
		System.out.println("Enter product Name");
		ProductName=sc.next();
		System.out.println("Enter product price");
		ProductPrice=sc.nextFloat();
		System.out.println("Enter product Amount");
		ProductAmount=sc.nextInt();
		System.out.println("_________________");
		ProductPrice=ProductAmount*ProductPrice;
		if (ProductPrice<=1000) {
			Gst=(ProductPrice*5)/100;
			TotalPayableAmount=ProductPrice+Gst;	
		}
		else if(ProductPrice>=1000 & ProductPrice<=2000) {
			Gst=(ProductPrice*10)/100;
			TotalPayableAmount=ProductPrice+Gst;
		}
		System.out.println(TotalPayableAmount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShoppingDetails ob = new ShoppingDetails();
		ob.Slip();
	}

}
