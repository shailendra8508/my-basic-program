package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1= new ArrayList();
   a1.add("manish");
   a1.add("rahul");
   a1.add(79054);
   
   Iterator i1=a1.iterator();
   while(i1.hasNext()) {
	   System.out.println(i1.next());
   }
	}

}
