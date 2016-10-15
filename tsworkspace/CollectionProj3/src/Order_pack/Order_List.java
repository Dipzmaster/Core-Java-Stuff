package Order_pack;

import java.util.LinkedList;

import Consumerpack.Consumer;

public class Order_List {
	
	public static LinkedList<Consumer>order()
	{
		
	LinkedList<Consumer> orderlist = new LinkedList<Consumer>();
	Consumer c1 = new Consumer(1,"Aruna",28542848,"1/1/2015");
	Consumer c2 = new Consumer(2,"Aswath",28542848,"11/1/2015");
	
	orderlist.add(c1);
	orderlist.add(c2);
	return orderlist;
}
}
