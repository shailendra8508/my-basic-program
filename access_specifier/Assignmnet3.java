package access_specifier;

public class Assignmnet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[4];

arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;

for(int i=0;i<=arr.length-1;i++) {
	if(arr[i]%2==0) {
		System.out.println(arr[i]+"is the even number");
	}
}
	}

}
