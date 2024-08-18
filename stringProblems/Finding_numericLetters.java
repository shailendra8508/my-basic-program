package stringProblems;



public class Finding_numericLetters {
static int count_of_numbers;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String input="5087659cent";
   
    char c1[]=input.toCharArray();
    
    for (int i=0;i<=c1.length-1;i++) {
    	boolean b1=Character.isDigit(c1[i]);
    	//System.out.println(b1);
    	if (b1==true) {
    		count_of_numbers++;
    		 
    	}
    	
    }
    System.out.println("the numbers of digits in giiven string are ->"+count_of_numbers);
   
    
    
   
	}

}
