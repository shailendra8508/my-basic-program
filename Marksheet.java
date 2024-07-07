package userinput;
import java.util.Scanner;

public class Marksheet {
	
		String name,fathername,collegename;
		float hindi,english,math,computer,totalnumber, totalpercentage;
		long rollnumber;
		Scanner sc = new Scanner(System.in);
		public void getmarks() {
			System.out.println("Enter your name");
			name = sc.nextLine();
			System.out.println("Enter your fathername");
			fathername =sc.nextLine();
			System.out.println("Enter your college name");
			collegename=sc.next();
			System.out.println("Enter your rollnumber");
			rollnumber=sc.nextLong();
			System.out.println("Please enter hindi marks");
			hindi=sc.nextFloat();
			System.out.println("Please enter english marks");
			english=sc.nextFloat();
			System.out.println("Please eneter math marks");
			math =sc.nextFloat();
			System.out.println("Enter computer marks");
			computer=sc.nextFloat();
			System.out.println("enter you total number");
			totalnumber=sc.nextFloat();
			totalpercentage=totalnumber/4;
			System.out.println("Student name is"+ name);
			System.out.println("Student fathername is"+ fathername);
			System.out.println("College name is"+ collegename);
			System.out.println("roll number is"+ rollnumber);
			System.out.println("hindi marks is"+ hindi);
			System.out.println("english marks is"+ english);
			System.out.println("math marks is"+ math);
			System.out.println("computer marks is"+ computer);
			System.out.println("________________________________");
			System.out.println("Toatal number is"+ totalnumber);
			System.out.println("________________________________");
			System.out.println("Total percentege is"+ totalpercentage);
			System.out.println("________________________________");
			
		}
			
	public static void main(String[]args) {
		Marksheet ob=new Marksheet();
		ob.getmarks();
		
	}
	}

