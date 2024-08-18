package array_programs;

import java.util.Scanner;

public class Count_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
Scanner sc= new Scanner(System.in);
System.out.println("Please enter the input");
String s1=sc.next();
System.out.println("please enter the charecter");
char c1=sc.next().charAt(0);
for(int i=0; i<=s1.length()-1;i++) {
	char c=s1.charAt(i);
	if(c1!=c) {
		count++;
	}
}
System.out.println("left "+c1 +" character remaning charecter count is "+count );

	}

}
