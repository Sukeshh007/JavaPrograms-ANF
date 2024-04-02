package com.demo;
import java.util.ArrayList;
import java.util.LinkedList;


public class ArrayListDemo {
	// array is internally using 
	// it is maintaining the insertion order
	// modification (insertion & deletion) of the data in  the 
	// array list is the time consuming.
	// duplication is allowed in the array list
	// multiple null are allowed
	// retrival of a data in array list is possible 
	
	public static void main(String[] args) {
		
		ArrayList<Comparable> list = new ArrayList<Comparable>();
		list.add(5);
		list.add("Sukesh");
		list.add("Sukesh");
		list.add('A');
		list.add(true);
		list.add(null);
		list.add(null);
		list.add("Hello");
		list.add(7.5f);
		
		String str = (String) list.get(2);
		System.out.println("element : " + str);
		
		//System.out.println(list);
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		
		System.out.println(list2.size()); // 3
		
		list2.add("four");
		list2.add("five");
		
		System.out.println(list2.size()); // 5

		list2.remove("Two");
		System.out.println(list2.size()); // 4

		list2.add(1, "two");
		System.out.println(list.get(4));
		System.out.println(list);
		
		
		
		
		
	}

}
