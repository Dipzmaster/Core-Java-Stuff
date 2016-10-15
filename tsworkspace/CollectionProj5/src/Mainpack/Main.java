package Mainpack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set set=new HashSet();
		String str = "good";
	  char c =	str.charAt(0);
	  switch(c){
	  case 'g': System.out.println("Addition");
	            break;
	            
	  
	  }
		set.add("pankaj");
		set.add("pankaj");
		set.add("Hello");
		set.add("Hiii");
		set.add(5);
		set.add(str);
		int res =str.hashCode();
		
		System.out.println("hashcode value"+res);
		System.out.println(set);
		System.out.println(set.contains("pankaj"));
		System.out.println(set.isEmpty());
		System.out.println(set.remove(5));
		System.out.println(set);
		
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
		

}
}
