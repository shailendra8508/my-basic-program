package stringProblems;

public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str="i love india";
 String reverse="";
    String s[]= str.split(" ");
    for(int i=0; i<=s.length-1;i++) {
    	char c1[]=s[i].toCharArray();
    	for(int j=c1.length-1;j>=0; j--) {
    		reverse=reverse+c1[j];
    	}
    	reverse=reverse+" ";
    }
    System.out.println(reverse);
	}

}
