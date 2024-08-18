package array_programs;

public class PalindromProgram {

	public static void main(String[] args) {
		String str="madam";
		
		String reverse="";
		for(int i=str.length()-1;i>=0;i--){
			char c=str.charAt(i);
			reverse=reverse+c;
		}
		System.out.println(reverse);
     boolean result=reverse.equals(str);
     if(result==true) {
    	 System.out.println("given string is palindrom");
     }
	}

}
