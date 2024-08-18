package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList arr= new ArrayList();
    arr.add("radhika");
    arr.add("Mountain");
    arr.add("Ankit");
    
                  ListIterator l1=arr.listIterator();
                 
                  while (l1.hasPrevious()) {
                	  System.out.println(l1.previous());
                  }
	}

}
