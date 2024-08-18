package stringProblems;

public class Palingdrom_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "Radar";
String reverse ="";
    String str = name.toUpperCase();
    //Logic is first we will reverse the string an then checking whether name and reversed string i sthe quals or not
    
    for (int i = str.length()-1;i>=0;i--) {
    	char c1 = str.charAt(i);
    	reverse =reverse+c1;
    }
    System.out.println(reverse);
    boolean  input= str.equals(reverse);
    System.out.println(input);
	}

}
