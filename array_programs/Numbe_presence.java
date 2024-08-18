package array_programs;

public class Numbe_presence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]=new int[5];
 arr[0]=12;
 arr[1]=13;
 arr[2]=15;
 arr[3]=34;
 arr[4]=33;
 int check_no=15;
 for(int i=0; i<=arr.length-1;i++) {
	 if(arr[i]==check_no) {
		 System.out.println("no present in the given array");
		 System.out.println("no i5 is present at iindex->" +i);
	 }
	 
 }
 
	}

}
