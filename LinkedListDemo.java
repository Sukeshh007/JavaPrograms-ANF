package com.demo;
import java.util.LinkedList;


public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(1);
		list.add(1);

		list.add(null);
		list.add(null);
		list.add(23);
		list.add("Hello..");
		list.add(true);
		list.add(2.5);
		
		System.out.println(list);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list2.add(1);
		list2.add(5);
		list2.add(15);
		list2.add(4);
		list2.add(17);
		list2.add(21);
		//list2.add("Hello");
		
		System.out.println(list2);
	}

}
