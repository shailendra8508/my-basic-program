package array_programs;

public class PalindromProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="RADAR";
    String reverse="";
    for(int i=name.length()-1;i>=0;i--) {
    	char c=name.charAt(i);
    	reverse=reverse+c;
    }
    boolean result=name.equals(reverse);
    if(result==true) {
    	System.out.println(name +" is palinrom");
    }
    else {
    	System.out.println(name +" is not palindrom");
    }
	}

}
