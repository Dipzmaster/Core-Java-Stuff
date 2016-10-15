package customerpack;

import java.util.LinkedList;



public class CustomerList {
	
	static LinkedList<Customer> list = new LinkedList<Customer>();
	  
	  public static void SaveCustomer(Customer c1)
	  {
		   
		  list.add(c1);
		  
		  
	  }
	  
	  public static LinkedList<Customer>getCustomerList()
	  {
		  return list;
	  }

}
