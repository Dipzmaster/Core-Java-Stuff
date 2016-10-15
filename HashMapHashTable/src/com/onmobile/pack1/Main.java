package com.onmobile.pack1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Main {
	
	public static void main(String []args){
		
		
	Hashtable<Integer,String> cityTable = new Hashtable<Integer,String>();
	cityTable.put(1, "Mumbai");
	cityTable.put(2, "Bangalore");
	cityTable.put(3, null); /* NullPointerEcxeption at runtime*/
	 
	System.out.println(cityTable.get(1));
	System.out.println(cityTable.get(2));
	System.out.println(cityTable.get(3));
	
	HashMap<Integer,String> productMap = new HashMap<Integer,String>();
	productMap.put(1, "Keys");
	productMap.put(2, null);
	
	HashSet<String> stateSet = new HashSet<String>();
	stateSet.add ("CA");
	stateSet.add ("WI");
	stateSet.add ("NY");
	 
	if (stateSet.contains("PB")) /* if CA, it will not add but shows following message*/
	System.out.println("Already found");
	else
	stateSet.add("PB");
}
}
