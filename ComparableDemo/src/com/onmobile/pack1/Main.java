package com.onmobile.pack1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
		
	public static void main(String[] args){
	
	ArrayList<Student> list = new ArrayList<Student>();
	list.add(new Student("Aksahy",40));
	list.add(new Student("Manoj",50));
	list.add(new Student("Vijay",100));
	Collections.sort(list);
	for(Student ob:list){
		System.out.println(ob);
	}
	}
	

}
