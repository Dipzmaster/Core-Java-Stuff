package com.onmobile.pack2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.onmobile.pack1.Product;

public class Billing {
	
	public static double getBill(Customer c){
		double amount = 0;
		Map<Integer,Integer>list = c.getShoppingMap();
		ArrayList<Product> al = c.getsList();
		
		Iterator<Product> itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
//		for(int i = 0;i<al.size();i++){
//			amount += al.get(i).getPrice();
//		}
		
		Collection<Integer> value = list.values();
		Iterator<Integer> itr1 = value.iterator();
		while(itr1.hasNext()){
			amount +=itr1.next();
		}
//	
//		for(Map.Entry<Integer, Integer> m :list.values()){ //advanced for loop for Map
//			amount += m.getValue();
//			}
		
		return amount;
	}

}
