package stringProblems;

public class Assignment66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String schoolname= " My School is DAV ";
                   char first_char=schoolname.charAt(11);
     //charAt method is use to find the at the given index in chatAt which character is available;
                   System.out.println(first_char);
                   int characterindex=schoolname.indexOf('s');
      //indexOf method is use to find the charecter index of given string
                   System.out.println(characterindex);
                   String trm=schoolname.trim();
  //trim() method of string is use to remove the first 
  //space and last space of the string it will not remove the spece in between of string  
                   System.out.println(trm);
    //subString method id use to extract the given charcter
    //there are two types of substring 1-> single parameter and diuble parameter;
                String str2="My name is shailendra singh";
                String extract=str2.substring(2);//Here given indexing of string will be extracr
                
                System.out.println(extract);
                String extract2=str2.substring(0,3);//here only it eill print the 0to 3 indexing string
                
                System.out.println(extract2);
                }

}
