package productpack;

import java.util.LinkedList;

public class ProductList {
	
	private Product p1 = new Product(1,"Diamondnecklace","Diamonds are for ever",30000);
	private Product p2 = new Product(2,"Goldbangales","Binds the relationship",20000);
	private Product p3 = new Product(3,"Silverbraclet"," Guard Always ",30000);
    
	public LinkedList<Product> Prod_List()
	{
		 LinkedList<Product> list = new LinkedList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		return(list);
	}
	
	public static void View_Prod_List(LinkedList<Product> list)
	{
		for (Product ob:list)
		{
			System.out.println("Product id  "+ob.getProdid());
			System.out.println("Product name  "+ob.getProdname());
			System.out.println("Product description "+ob.getProddesc());
			System.out.println("Product price  "+ob.getProdprice());
		}
	}
	
}
