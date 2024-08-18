package com.assignment;

public class Assignment74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="shail@ 7903";
int count_of_specialcharecter=0;
int count_of_space=0;
int count_of_alphabet=0;
int count_of_numeric=0;
char c2[]=str.toCharArray();
for(int i=0; i<=c2.length-1;i++) {
	if(Character.isSpaceChar(c2[i])) {
		count_of_space++;
	}
	if(Character.isDigit(c2[i])) {
		count_of_numeric++;
	}
	if(Character.isLetter(c2[i])) {
		count_of_alphabet++;
	}
	
	
}
System.out.println(count_of_space);
System.out.println(count_of_numeric);
System.out.println(count_of_alphabet);
count_of_specialcharecter=(str.length())-(count_of_alphabet+count_of_numeric+count_of_space);
System.out.println("count_of_specialcharecter is ->"+count_of_specialcharecter);
	}

}
