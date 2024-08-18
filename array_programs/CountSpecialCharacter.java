package array_programs;

public class CountSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="50cent @/*";
int count_of_number = 0,count_of_letter = 0,count_of_space = 0,count_of_specialcharecter=0;
for(int i=0; i<=str.length()-1;i++){
	char c=str.charAt(i);
	if(Character.isDigit(c)) {
		count_of_number++;
	}
	if(Character.isLetter(c)) {
		count_of_letter++;
	}
	if(Character.isSpaceChar(c)) {
		count_of_space++;
	}
}
System.out.println(count_of_number);
System.out.println(count_of_letter);
System.out.println(count_of_space);
count_of_specialcharecter=str.length()-(count_of_number+count_of_letter+count_of_space);
System.out.println(count_of_specialcharecter);
	}

}
