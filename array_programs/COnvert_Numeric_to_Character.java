package array_programs;

public class COnvert_Numeric_to_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="a2b3c4";

for(int i=0; i<=s1.length()-1;i++) {
	if(Character.isLetter(s1.charAt(i))) {
		System.out.println(s1.charAt(i));
	}
	else {
		int a=Character.getNumericValue(s1.charAt(i));
		for(int j=1;j<a;j++) {
			System.out.println(s1.charAt(i-1));
		}
	}
	
}

	}

}
