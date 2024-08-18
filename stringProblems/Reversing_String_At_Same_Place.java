 package stringProblems;

import java.util.Arrays;

public class Reversing_String_At_Same_Place {
static String input = "my name is shailendra singh";

	
	public static void main (String[]args) {
		String reverse="";
		
	String s[]=input.split(" ");
	System.out.println(Arrays.toString(s));
	// String[]=my,name,is,shailendra,singh;
	for(int i=0; i<=s.length-1;i++) {
		    char c []=s[i].toCharArray();
		    for(int j=c.length-1; j>=0;j--) {
		    	reverse=reverse+c[j];
		    }
		    reverse=reverse+" ";    
	}
	System.out.print(reverse);
	
		
		
		
		
	}
}
