package stringProblems;

public class Finding_Alphabets {
static int count_of_letter;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s1="slary of shailendra 24000";
  char c1[]=s1.toCharArray();
  
  for (int i=0; i<=c1.length-1;i++) {
	  if(Character.isLetter(c1[i])==true) {
		  count_of_letter++;
	  }
	  
  }
  System.out.println("count of letter in given strin are->"+count_of_letter);
	}

}
