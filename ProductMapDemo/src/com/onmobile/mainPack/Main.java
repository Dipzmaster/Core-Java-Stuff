package com.onmobile.mainPack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.onmobile.pack1.Product;
import com.onmobile.pack1.ProductAccessClass;
import com.onmobile.pack2.Billing;
import com.onmobile.pack2.Customer;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Customer c = new Customer();
		Map<Integer,Double> totalList = new HashMap<Integer,Double>();

		while(true){
			System.out.println("1. Add a Product");
			System.out.println("2. Get a Product");
			System.out.println("3. List of products"); 
			System.out.println("4. Customer module : Add to Cart");
			System.out.println("5. Customer module : Billing module");
			System.out.println("6. Total Amount transaction:Admin module");

			System.out.println("7. Exit");

			int choice = scanner.nextInt();
			switch(choice){
			case 1:
			{
				System.out.println("Enter product name");
				String pName = scanner.next();

				System.out.println("Enter Product price");
				int pPrice = scanner.nextInt();

				ProductAccessClass.addProduct(new Product(pName,pPrice));
				System.out.println("Entry has been made");

				break;

			}
			case 2:
			{
				System.out.println("Enter the PID");
				int pid = scanner.nextInt();
				Product p = ProductAccessClass.getProduct(pid);
				System.out.println(p);

				break;
			}
			case 3:
			{
				System.out.println(ProductAccessClass.getProductList());
				break;
			}
			case 4:{
				System.out.println();


				while(true){
					String ch = "Y";
					System.out.println("Enter a product id to add to cart");
					int pid = scanner.nextInt();
					System.out.println("Enter no of	quantity");
					int noOfQuantity = scanner.nextInt();
					c.addToCart(pid,noOfQuantity);
					System.out.println("Do you want to continue");
					ch = scanner.next();
					if(ch.charAt(0)=='N'){
						break;
					}
				}
			}	
			case 5:
			{
				System.out.println("Billing module");

				System.out.println("the total bill for txn id "+ c.getTid()+" is "+Billing.getBill(c));
				break;
			}
			case 6:
			{
				totalList.put(c.getTid(),Billing.getBill(c));
				Collection set1 = totalList.values();
				Iterator<Double> itr = set1.iterator();
				double total =0;
				while(itr.hasNext()){
					total += itr.next();

				}
				System.out.println(total);
				break;

			}

			default:
				System.out.println("Bye");
				System.exit(0);

			}

		}
	}
}
