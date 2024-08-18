package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Use_of_Iterable_for_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList arr= new ArrayList();
     arr.add("Manish");
     arr.add("Ram");
     arr.add("Supriya");
     arr.add("Ankit");
     arr.add("Satyam");
     System.out.println(arr);
     Iterator i1=arr.iterator();
     while(i1.hasNext()) {
    	 System.out.print(i1.next()+" ");
    	 
     }
     		
	}

}
