package com.onmobile.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		ArrayList<Person>al = new ArrayList<Person>();
		al.add(new Person(1,"Akshay",23));
		al.add(new Person(2,"Akshay",22));
		al.add(new Person(3,"Vijay",21));
		al.add(new Person(4,"Subhash",20));
		al.add(new Person(5,"Manoj",22));
		
		Collections.sort(al,new AgeCompare()); 
		Iterator itr = al.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		
		System.out.println("_____________________________________________________________");
		Collections.sort(al,new NameComparator());
		Iterator itr1 = al.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}

	}

}
