package com.assignment;

import java.util.ArrayList;

public class Assignmnet113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList a1= new ArrayList();
a1.add("Manish");
a1.add("radhika merchant");
a1.add("she will be my wife in next birth");
a1.add("I will enjoy with her in peris");

int index_of_Manish=a1.indexOf("Manish");
System.out.println(index_of_Manish);

System.out.println(a1.get(2));
a1.set(1, "rajan");
System.out.println(a1);


	}

}
