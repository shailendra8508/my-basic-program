package com.assignment;

import java.util.ArrayList;

public class AAssignmrnt101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList arr= new ArrayList();
  arr.add("shailendra");
  arr.add("Manish");
  arr.add("Satyam");
  arr.add("Rohit");
  arr.add(30);
  arr.add(40);
  arr.add(790328);
  arr.add(true);
  arr.add(10.20);
  System.out.println(arr);
  ArrayList a=new ArrayList();
  a.addAll(arr);
  a.add("ram");
  System.out.println(a);
  boolean b1=a.contains("Manish");
  System.out.println(b1);
  arr.remove("shailendra");
  System.out.println(arr);
  System.out.println(a.containsAll(arr));
   a.removeAll(arr);
   System.out.println(a);
   a.clear();
   System.out.println(a);
   System.out.println(arr.size());
	}

}
