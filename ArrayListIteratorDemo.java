package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
// list interface - all declare methods no definition


/*
interface List
{
	void iterator();
}
interface Queue
{
	void add();
}
class ArrayList implements List
{
	
}
*/
public class ArrayListIteratorDemo {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		//ArrayList list = new ArrayList();
		
		 // PriorityQueue list = new PriorityQueue();
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		// traversing list elements in forward direction using Iterator
		Iterator iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		// traversing list elements using Iterator
		// list iterator is only applicable to list interface and its impletation
		// not for Queue Set Map
		
		
		ListIterator listIterator = list.listIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
				
		
		
	}

}
