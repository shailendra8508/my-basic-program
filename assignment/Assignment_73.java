package com.assignment;

public class Assignment_73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="shaile 7903";
int count_of_space=0;
int count_of_numeric=0;
   char c1[]=str.toCharArray();
for (int i=0; i<=c1.length-1; i++) {
	if(Character.isDigit(c1[i])) {
		count_of_numeric++;
	}
	if(Character.isSpaceChar(c1[i])) {
		count_of_space++;
	}
}
System.out.println(count_of_space);
System.out.println(count_of_numeric);
	}

}
