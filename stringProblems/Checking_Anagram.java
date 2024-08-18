package stringProblems;


import java.util.Arrays;

public class Checking_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String input="act";
  String input1="cat";
  
  char c1[]=input.toCharArray();
  char c2[]=input1.toCharArray();
  
  
  if (input.length()!=input1.length()) {
	  System.out.println("This is not angram");
  }
  else 
  {
	System.out.println("This is angram but needs to check the logic");  
	Arrays.sort(c1);
	Arrays.sort(c2);
	System.out.println(Arrays.toString(c1));
	  System.out.println(Arrays.toString(c2));
	  
	  boolean myfinalanswer=Arrays.equals(c1, c2);
	  if(myfinalanswer==true) {
		  System.out.println("Hey the given 2 strings are anagram");
		  
		  
	  }
	  else {
		  System.out.println("The given 2 string are not anagram");
	  }
	
  }
	}

}
