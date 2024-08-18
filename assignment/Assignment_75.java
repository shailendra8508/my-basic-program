package com.assignment;

import java.util.Arrays;

public class Assignment_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="cat";
String str1="act";
char c1[]=str.toCharArray();
char c2[]=str1.toCharArray();
int lgth1=c1.length;
int lgth2=c2.length;
if(lgth1==lgth2) {
	System.out.println("this is anagram but need to check by logic");
}
Arrays.sort(c1);
Arrays.sort(c2);
System.out.println((Arrays.toString(c1)));
System.out.println((Arrays.toString(c2)));
boolean ans=Arrays.equals(c1,c2);
System.out.println("Give two string is anagram is->"+ans);
	}

}
