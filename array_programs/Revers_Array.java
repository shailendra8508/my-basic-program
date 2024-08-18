package array_programs;

import java.util.Arrays;

public class Revers_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rollno[]=new int[3];
rollno[0]=10;
rollno[1]=20;
rollno[2]=30;
int rollno_reverse[]=new int[rollno.length];
int k=0;

for(int i=rollno.length-1;i>=0;i--) {
	 rollno_reverse[i]= rollno[k];
     k++; 
}
System.out.println(Arrays.toString(rollno_reverse));
	}

}
