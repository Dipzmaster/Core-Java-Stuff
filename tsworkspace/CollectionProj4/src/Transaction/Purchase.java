package Transaction;

import java.util.LinkedList;
import java.util.Scanner;

import productpack.Product;
import productpack.ProductList;
import customerpack.Customer;

public class Purchase {
	public Customer buy_Products(Customer c)
	{   
		int billamt=0;
		String option;
		boolean choice=true;
		Scanner sc = new Scanner(System.in);
		
		ProductList ob = new ProductList();
		LinkedList<Product> list = ob.Prod_List();
		do
		{
			System.out.println("Enter the product name");
			 String pname = sc.next();
			 
		     for (Product o:list)
		     {
		    	 if (o.getProdname().equals(pname))
		    	 {
		    		 c.setItems(o);
		    		 billamt+=o.getProdprice();
		    	 }
		    	 
		    		 
		     }
				
		System.out.println("Do you wish to continue");
		 option = sc.next();
		 if (option.equals("NO"))
		 	choice = false;
		 	
		}while(choice);
	
		
		c.setBillamt(billamt);
		return(c);
		
	}
	

}
