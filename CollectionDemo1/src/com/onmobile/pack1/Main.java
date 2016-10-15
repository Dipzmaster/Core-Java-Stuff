package com.onmobile.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
//		Set set = new HashSet();
//		
//		set.add("one");
//		set.add("seconnd");
//		set.add(new Integer(4));
//		set.add(112);
//		set.add(new Float(5.3f));
//		set.add(new Double(1));
//		
//		System.out.println(set);
//		
//		List list = new ArrayList();
//		
//		list.add("one");
//		list.add("seconnd");
//		list.add(new Integer(4));
//		list.add(112);
//		list.add(new Float(5.3f));
//		list.add(new Double(1));
//		list.add("one");
//		System.out.println(list);

//		System.out.println(list);
//		
//		list.remove(new Integer(112));
//		list.remove(1);
//		System.out.println(list.isEmpty());
//		System.out.println(list.indexOf(5.3f));
//		list.set(0, 16665);
//		System.out.println(list+" "+list.size());
//		
		
//	List<Book> bookList = new ArrayList<Book>();
//			bookList.add(new Book(1,"Wonder",100.1));
//			bookList.add(new Book(2,"of",1));
//			bookList.add(new Book(3,"Java",300.5));
//			
//			Iterator itr = bookList.iterator();
//			while(itr.hasNext())
//			System.out.println(itr.next());
//		
		ArrayList<Integer> list=new ArrayList<Integer>(); 
		list.add(1);
		list.add(10);
		list.add(100);
		list.add(1211);
		list.add(1201);
		list.add(1101);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("Ajay");
		tree.add("Vijay");
		tree.add("Ajay");
		tree.add("Vijay");
		Iterator itr = tree.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(tree);
	
	}
	
}

