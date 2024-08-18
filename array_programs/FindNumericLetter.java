package array_programs;

public class FindNumericLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="50cent";
int count=0;
for(int i=0;i<=str.length()-1;i++) {
	char c=str.charAt(i);
	if(Character.isDigit(c)) {
		count++;
	}
	
}
System.out.println("digit count is->" +count);
	}

}
