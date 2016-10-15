package Consumerpack;

import java.util.LinkedList;

public class Consumer_List {
  static LinkedList<Consumer> list = new LinkedList<Consumer>();
  
  public static void SaveConsumer(Consumer c1)
  {
	   
	  list.add(c1);
	  
	  
  }
  
  public static LinkedList<Consumer>getConsumerList()
  {
	  return list;
  }
	
	
}
