package stringProblems;

public class ReversingStrung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Shailendra";
 String reverse="";
 for(int i=str.length()-1; i>=0;i--) {
	 char c=str.charAt(i);
	 reverse=reverse+c;
 }
 System.out.println(reverse);
	}

}
