package stringProblems;

import java.util.Arrays;

public class Copiying_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= new int[3];
arr[0]=10;
arr[1]=12;
arr[2]=13;
int copied_array[]=new int[arr.length];
for(int i=0;i<=arr.length-1;i++) {
	copied_array[i]=arr[i];
}
System.out.println(Arrays.toString(copied_array));
System.out.println(Arrays.toString(arr));
boolean result=Arrays.equals(arr,copied_array);
System.out.println(result);
	}

}
