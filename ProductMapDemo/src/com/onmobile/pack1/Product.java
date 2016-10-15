package com.onmobile.pack1;

public class Product {
	private int id;
	private String name;
	private int price;
	
	private static int count =1;	
	
	
	
	public Product(String name, int price) {
		super();
		this.id = count++;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ "]";
	}
	

	

	
	
	
	
}
