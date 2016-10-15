package com.onmobile.pack1;

import java.util.ArrayList;

public class ProductAccessClass {

	private static ArrayList<Product> productList = new ArrayList<Product>();

	public static void addProduct(Product p){

		productList.add(p);
	}


	public static Product getProduct(int pid){
		for(Product product:productList){
			if(product.getId()==pid){
				return product;
			}
		}
		return null;
	}

	public static ArrayList<Product> getProductList(){
		return productList;
	}
}
