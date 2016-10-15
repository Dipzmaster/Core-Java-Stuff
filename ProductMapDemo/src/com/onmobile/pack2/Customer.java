package com.onmobile.pack2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.onmobile.pack1.Product;
import com.onmobile.pack1.ProductAccessClass;

public class Customer {

	private static int count =1;

	private final int tid;
	private ArrayList<Product> sList = new ArrayList<Product>();
	private Map<Integer,Integer> shoppingMap = new HashMap<Integer,Integer>();


	public Customer() {
		super();
		this.tid = count++;
	}


	public static int getCount() {
		return count;
	}


	public int getTid() {
		return tid;
	}


	public ArrayList<Product> getsList() {
		return sList;
	}


	public Map<Integer, Integer> getShoppingMap() {
		return shoppingMap;
	}

	public void addToCart(int pid,int noOfQuantity){
		Product product = ProductAccessClass.getProduct(pid);
		sList.add(product);
		shoppingMap.put(product.getId(),noOfQuantity*product.getPrice());
	}
}
