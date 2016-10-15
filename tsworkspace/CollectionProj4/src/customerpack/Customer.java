package customerpack;

import java.util.ArrayList;

import productpack.Product;

public class Customer {
private int custid;
private String custname;
private ArrayList<Product> items = new ArrayList<Product>();
private int billamt;
public Customer(int custid, String custname) 
{
	super();
	this.custid = custid;
	this.custname = custname;
	
}






public int getCustid() {
	return custid;
}






public void setCustid(int custid) {
	this.custid = custid;
}






public String getCustname() {
	return custname;
}






public void setCustname(String custname) {
	this.custname = custname;
}






public ArrayList<Product> getItems() {
	return items;
}






public void setItems(Product p) {
	items.add(p);
}






public int getBillamt() {
	return billamt;
}






public void setBillamt(int billamt) {
	this.billamt = billamt;
}






public void displayConsumerInfo()
{
  System.out.println("Customer id   "+custid);	
  System.out.println("Customer name "+custname);
  for (Product ob:items)
  {
	  System.out.println("Product: "+ob.getProdname()+"Price: Rs."+ob.getProdprice());
  }
  System.out.println("Purchase amount:   Rs."+billamt);
  System.out.println("Discount bill amount: Rs."+ calc_discount());
}

public double calc_discount()
{
	if (billamt >=50000)
		return (billamt - billamt*0.2);
	else if ((billamt >= 20000)&&(billamt <50000))
	     return (billamt - billamt*0.1);
	else
		return(billamt);
}





}
