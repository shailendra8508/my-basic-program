package access_specifier;

public class Assignmnet_1 {

	public static void main(String[]args) {
		String str="shailendra";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			char c1=str.charAt(i);
			reverse=reverse+c1;
		}
		System.out.println(reverse);
		boolean result=str.equals(reverse);
		System.out.println(result);
		if(result==true) {
			System.out.println("the given strng is palindrom");
		}
	}
}
