package array_programs;

public class Finding_Dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="shashtattp";
     
                   char c[]=str.toCharArray();
                   
                   
                   for(int i= 0; i<=c.length-1;i++) {
                	   int count=0;
                	   for(int k=0;k<=c.length-1;k++) {
                		   if(c[i]==c[k]) 
                		   {
                			   count++;
                			    
                		   }
                		   
                		   System.out.println(c[i]+"="+count);
                	   }
                	   
                	  
                   }
                   

	}}
