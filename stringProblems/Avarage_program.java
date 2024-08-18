package stringProblems;

public class Avarage_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= new int[4];
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
int average=0;
int sum=0;

for(int i=0; i<=arr.length-1;i++) {
	sum=sum+arr[i];
}
System.out.println(sum/arr.length);

}

}
