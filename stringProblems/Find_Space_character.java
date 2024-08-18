package stringProblems;

public class Find_Space_character {
  static int count_of_space;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="slaray of ram is 20lpa";
char []c1=str.toCharArray();
for (int i=0; i<=str.length()-1;i++) {
	
	if (Character.isSpaceChar(c1[i])==true) {
		count_of_space++;
	}
	
}
System.out.println("count of speces in the given string is->"+count_of_space);
	}

}
