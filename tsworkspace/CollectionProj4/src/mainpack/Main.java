package mainpack;

import java.util.LinkedList;

import Transaction.Purchase;

import customerpack.Customer;
import customerpack.CustomerList;
import productpack.Product;
import productpack.ProductList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double daysalesamt =0;
		ProductList ob = new ProductList();
		LinkedList<Product> list = ob.Prod_List();
		ProductList.View_Prod_List(list);
		
		
		
		Customer c1 = new Customer(1,"Vidhya");
		Purchase p = new Purchase();
		c1 = p.buy_Products(c1);
		c1.displayConsumerInfo();
		CustomerList.SaveCustomer(c1);
		
		Customer c2 = new Customer(2,"Veena");
		c2 = p.buy_Products(c2);
		c2.displayConsumerInfo();
		CustomerList.SaveCustomer(c2);
		
		LinkedList<Customer> clist = CustomerList.getCustomerList();
		
		for (Customer c: clist)
		{
			daysalesamt+=c.calc_discount();
		}
	  System.out.println("Day sales amount= "+daysalesamt);	
	}

}
