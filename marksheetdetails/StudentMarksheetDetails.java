package marksheetdetails;

import java.util.Scanner;

public class StudentMarksheetDetails {
	
	String Name,FathersName,CollegeName,CourseName;
	int RollNumber;
	float Hindi,English,Math,Computer,Science;
	float Total,Percentage;
	
	public void GetDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Name");
		Name=sc.nextLine();
		System.out.println("Please enter your father's name");
		FathersName=sc.nextLine();
		System.out.println("Enter your college name");
		CollegeName=sc.next();
		System.out.println("Enter your course name");
		CourseName=sc.next();
		System.out.println("please Enter your roll number");
		RollNumber=sc.nextInt();
		System.out.println("Please enter your hindi subject marks");
		Hindi=sc.nextFloat();
		System.out.println("Please enter your english subject ,marks");
		English=sc.nextFloat();
		System.out.println("Please enter your math subject marks");
	    Math=sc.nextInt();
		System.out.println("Enter your Computer subject marks");
		Computer=sc.nextInt();
		System.out.println("Please enter you Science subject marks");
		Science=sc.nextInt();
		System.out.println("________________________________________");
		Total=Hindi+English+Math+Computer+Science;
		System.out.println(Total);
		System.out.println("__________________________________________");
		Percentage=Total/5;
		System.out.println(Percentage);
		
	}
	
	public static void main (String[]args) {
		StudentMarksheetDetails ob = new StudentMarksheetDetails();
		ob.GetDetails();
		
	}

}
