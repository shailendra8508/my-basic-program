package student_details;

public class Students {
	String Studentname,MobileNumber,comapanyName,CollegeName;
	float age;
	float salary;
	
	void ShailendraDetails() {
		String StudentName="Shalendrasingh";
		String MobileNumber="7903280515";
		String companyName="TCS";
		String CollegeName="ABES";
		float age= 25;
		float salary=40000;
		
		System.out.println(StudentName);
		System.out.println(MobileNumber);
		System.out.println(companyName);
		System.out.println(CollegeName);
		System.out.println(age);
		System.out.println(salary);
		
		
	}
	void AkashDetails() {
		String StudentName="Akashsingh";
		String MobileNumber="78503280515";
		String companyName="TCS";
		String CollegeName="ABES";
		float age= 26;
		float salary=45000;
		
		System.out.println(StudentName);
		System.out.println(MobileNumber);
		System.out.println(companyName);
		System.out.println(CollegeName);
		System.out.println(age);
		System.out.println(salary);
		
	}
	void AnkitDetails() {
		String StudentName="Ankitsingh";
		String MobileNumber="850880515";
		String companyName="TCS";
		String CollegeName="ABES";
		float age= 25;
		float salary=48000;
		
		System.out.println(StudentName);
		System.out.println(MobileNumber);
		System.out.println(companyName);
		System.out.println(CollegeName);
		System.out.println(age);
		System.out.println(salary);
		
	}
	
	
	
	
	
	
	
	public static void main (String args[]) {
		Students ob = new Students();
		ob.ShailendraDetails();
		ob.AkashDetails();
		ob.AnkitDetails();
		
	}

}
