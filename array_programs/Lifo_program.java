package array_programs;

import java.util.Scanner;

public class Lifo_program {
void getData() {
	int a[]=new int[5];
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter 5 value");
	for(int i=0;i<=a.length-1;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("printing the array in the lifo form");
	for(int i=a.length-1; i>=0;i--) {
		System.out.println(a[i]);
	}
	   
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lifo_program ob= new Lifo_program();
		ob.getData();
	}

}
