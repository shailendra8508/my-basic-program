package com.collection;

import java.util.ArrayList;

public class ArrayllistMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first methods using
    ArrayList a= new ArrayList();
    a.add("Manish");
    a.add("ram");
    a.add(7903);
    a.add(31);
    a.add(false);
    a.add('c');
    a.add(7903280);
    System.out.println(a);
    //here we checked with the homoginoius value and hetrogenoius vale.
    //here going to use second method of collection.
    ArrayList a1= new ArrayList();
    a1.addAll(a);//here we are ading all the value of a in a1.
    System.out.println(a1);
    //we can add  more value in a1
    a1.add("Ram");
    a1.add("shyam");
    System.out.println(a1);
    //3rd method cotains.
   boolean s1= a1.contains("Ram");
   
   System.out.println(s1);
   boolean s2= a1.containsAll(a);
   System.out.println(s2);
   System.out.println(a1.isEmpty());
   a1.remove("Ram");
   System.out.println(a1);
   a1.removeAll(a);
   System.out.println(a1);
   
   System.out.println(a.size());
   
	}

}
