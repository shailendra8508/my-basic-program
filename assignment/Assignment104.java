package com.assignment;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();
a1.add("Ram");
a1.add("shail");
a1.add("name");
ListIterator l1= a1.listIterator();
while(l1.hasPrevious()) {
	System.out.println(l1.previous());
}
	}

}
