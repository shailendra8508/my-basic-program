package com.assignment;

public class Assignment72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="50cent";
int count_of_alphabets=0;
char c1[]=str.toCharArray();
for (int i=0; i<=c1.length-1;i++) {
	if(Character.isLetter(c1[i])) {
		count_of_alphabets++;
	}
}
System.out.println(count_of_alphabets);
	}

}
