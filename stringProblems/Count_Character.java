package stringProblems;

import java.util.Scanner;

public class Count_Character {
	void GetCount(String input, char input1) {
		
		int count=0;
		char []c1=input.toCharArray();
		for(int i=0; i<=c1.length-1;i++) {
			if(input1==c1[i]) {
				count++;
			}
			
		}
		System.out.println("Given Charecter count is->" +count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_Character ob = new Count_Character();
      Scanner sc = new Scanner(System.in);
      System.out.println("please enter the String");
          String input=sc.next();
          System.out.println("Please enter the character to count");
          char input1=sc.next().charAt(0);
          ob.GetCount(input,input1);
      
	}

}
