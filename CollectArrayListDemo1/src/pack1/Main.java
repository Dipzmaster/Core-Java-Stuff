package pack1;

import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 ArrayList<String> obj = new ArrayList<String>();

		  /*This is how elements should be added to the array list*/
		  obj.add("Ajeet");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");

		  /* Displaying array list elements */
		  System.out.println("Currently the array list has following elements:"+obj);

		  /*Add element at the given index*/
		  obj.add(0, "Rahul");
		  obj.add(1, "Justin");

		  /*Remove elements from array list like this*/
		  obj.remove("Chaitanya");
		  obj.remove("Harry");

		  System.out.println("Current array list is:"+obj);

		  /*Remove element from the given index*/
		  obj.remove(0);

		  System.out.println("Current array list is:"+obj);
		  
		  
		  //Add collections using addAll()
		  ArrayList<String> collection = new ArrayList<String>();
		   collection.add("One");
		   collection.add("Two");
		   collection.add("Three");

		   // add the collection in the LinkedList at index 2
		   obj.addAll(2, collection);
		   System.out.println("Current array list is:"+obj);
		   //Remove collections using removeAll()
		   obj.removeAll(collection);
		   System.out.println("Current array list is:"+obj);
		   
		   
		   //contains method
		   
		   System.out.println(obj.contains("Ajeet"));
		   
		   
		   //containsAll method
		   
		   System.out.println(obj.containsAll(collection));
		   
		   // isEmpty method
		   
		   System.out.println(obj.isEmpty());
		   
		// toArray copies content into other array
		   String list2[] = new String[obj.size()];
		   list2 = obj.toArray(list2);

		   System.out.println("Printing elements of array2");

		   // let us print all the elements available in list
		   for (String str : list2) {
		   System.out.println("Names: "+str);
		   }
		   
		   //index of
		   
		   System.out.println(obj.indexOf("Steve"));
		   
		   obj.add("Justin");
		   
		   //lastindexof
		   
		   System.out.println(obj.lastIndexOf("Justin"));
		   
		   
		   
		   System.out.println(obj);
		   

		   
	}

}
