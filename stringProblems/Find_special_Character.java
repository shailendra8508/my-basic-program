package stringProblems;

public class Find_special_Character {
static int count_of_digit;
static int count_of_letters;
static int count_of_spaces;
static int count_of_specialcharacter;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String input="90#* aman";
   
   char c1[]=input.toCharArray();
   for (int i=0; i<input.length();i++) {
	   if(Character.isDigit(c1[i])==true) {
	   count_of_digit++;
   }
   if (Character.isLetter(c1[i])==true) {
	   count_of_letters++;
   }
   if (Character.isSpaceChar(c1[i])==true) {
	   count_of_spaces++;
   }
   
   }
   System.out.println("count_of_digit in given string->" +count_of_digit);
   System.out.println("count_of_letters in the given String->"+count_of_letters );
   System.out.println("count_of_spaces in the given String->"+count_of_spaces);
   count_of_specialcharacter=(input.length())-(count_of_letters+count_of_spaces+count_of_digit);
   System.out.println("count_of_specialcharacter in given string is->"+count_of_specialcharacter);
	}

}
