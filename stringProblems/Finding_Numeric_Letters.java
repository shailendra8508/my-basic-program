package stringProblems;

public class Finding_Numeric_Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="50cent";
int count_of_Numeric=0;
int count_of_Letters=0;
  char c1[]= s.toCharArray();
  for(int i=0;i<=c1.length-1;i++) {
	  if(Character.isDigit(c1[i])) {
		  count_of_Numeric++;
	  }
	  if(Character.isLetter(c1[i])) {
		  count_of_Letters++;
	  }
  }
  System.out.println(count_of_Numeric);
  System.out.println(count_of_Letters);
	}

}
