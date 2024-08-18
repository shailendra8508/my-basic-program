package fee_structure;

import java.util.Scanner;

public class Studentfeedetails {
	String Name, FathersName,CollegeName,FeesMode;
	int RollNumber;
	float FeeSubmit,Balancefees;
	float TotalFees=50000;
	
	public void FeeStructure() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you Name");
		Name=sc.nextLine();
		System.out.println("Please enter you father's name");
		FathersName=sc.nextLine();
		System.out.println("Please enter your college name");
	CollegeName=sc.next();
	System.out.println("Please neter your Fees mode");
	FeesMode=sc.next();
	System.out.println("Please enter your roll number");
	RollNumber=sc.nextInt();
	System.out.println("Please enter your Fees submitted");
	FeeSubmit=sc.nextFloat();
	System.out.println("__________________________________");
   float Balancefees=TotalFees-FeeSubmit;
    System.out.println(Balancefees);
}
	
	
 
	public static void main (String [] args) {
		Studentfeedetails ob=new Studentfeedetails();
		ob.FeeStructure();
		
		
	}

}
