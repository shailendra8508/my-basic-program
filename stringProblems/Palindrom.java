package stringProblems;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String input="Madam";
 String reverse="";
  String input1=input.toUpperCase();
  for (int i=input1.length()-1; i>=0;i--) {
	  char c1=input1.charAt(i);
	  reverse = reverse+c1;
  }
  System.out.println(reverse);
  boolean result =input1.equals(reverse);
  System.out.println(result);
	}
	

}
