 package array_programs;

import java.util.Scanner;

public class Find_Vowel_letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 char chr[]= new char[5];
 Scanner sc= new Scanner(System.in);
 System.out.println("please netr 5 input");
 for(int i=0; i<=chr.length-1;i++) {
	 chr[i]=sc.next().charAt(0);
 }
 for(int i=0; i<=chr.length-1;i++) {
	 if(chr[i]=='a'||chr[i]=='e'||chr[i]=='i'||chr[i]=='o'||chr[i]=='u') {
		 System.out.println(chr[i]+" is vowel letter");
	 }
	 else {
		 System.out.println(chr[i]+" is consonent");
	 }
 }
	}

}
