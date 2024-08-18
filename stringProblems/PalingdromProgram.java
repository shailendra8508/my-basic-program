package stringProblems;

public class PalingdromProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "RADAR";
String reverse="";
for(int i=s.length()-1; i>=0;i--) {
	char c1=s.charAt(i);
	reverse=reverse+c1;
}
System.out.println(reverse);
boolean result=reverse.equals(s);
System.out.println(result);

	}

}
