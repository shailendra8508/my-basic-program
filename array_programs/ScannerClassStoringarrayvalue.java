package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerClassStoringarrayvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr[]=new String [5];
Scanner sc= new Scanner(System.in);
System.out.println("Please enter 5 string type data");
for(int i=0; i<=arr.length-1;i++) {
	arr[i]=sc.next();
}
System.out.println(Arrays.toString(arr));
	}

}
