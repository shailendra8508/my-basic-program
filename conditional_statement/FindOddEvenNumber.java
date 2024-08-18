package conditional_statement;

import java.util.Scanner;

public class FindOddEvenNumber {
	int age;
	
public void ValidateAge() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your age");
	age = sc.nextInt();
	if (age>18) {
		
	}
	
}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		FindOddEvenNumber ob = new FindOddEvenNumber();
		ob.ValidateAge();
	}

}
