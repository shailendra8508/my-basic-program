package com.assignment;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a2= new ArrayList();
a2.add("Manish");
a2.add("rasha");
a2.add(7903);
ListIterator i1= a2.listIterator();
while(i1.hasNext()) {
	System.out.println(i1.next());
}
while(i1.hasPrevious()) {
	System.out.println(i1.previous());
}
	}

}
