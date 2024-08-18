package array_programs;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name= "Shailendrasingh";
             char c1[]=name.toCharArray();
             System.out.println(Arrays.toString(c1));
             boolean name1=name.contains("singh");
             System.out.println(name1);
             boolean name2=name.endsWith("singh");
             System.out.println(name2);
	}
	

}
