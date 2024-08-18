package stringProblems;

public class Check_15_presence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[4];
arr[0]=12;
arr[1]=13;
arr[2]=15;
arr[3]=16;
int no_to_check=15;

for(int i=0; i<=arr.length-1;i++) {
	if(arr[i]==no_to_check) {
		System.out.println("Numner 15 is present");
		System.out.println("no i5 is present at iindex->" +i);
	}
	
}


	}

}
