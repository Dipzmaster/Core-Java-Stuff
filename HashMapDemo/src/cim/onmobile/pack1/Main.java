package cim.onmobile.pack1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args){
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("Karnataka","Bangalore");
		map.put("Maharashtra", "Mumbai");
		map.put("Tamil Nadu","Chennai");
		map.put("Kerala", "Trivandum");
		map.put("Andhra", null);
		map.put(null, null);
		//to print both key and value
		Collection set = map.entrySet();
		 System.out.println("Print map elements "+set);
		 
		 
		 //to print only keys
		 Set set1  = map.keySet();
		 System.out.println("Print map keys " +set1);
		 
		 //to print only the value of map
		 Collection collection = map.values();
		 System.out.println("print map values "+collection);
		 
		 Set<String> key = map.keySet();
		Iterator itr = key.iterator();
		
		while(itr.hasNext()){
			String st = (String) itr.next();
			System.out.println(st+" = ---------------->"+map.get(st));
		}
	}

}
