package pack1;

import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 LinkedList<String> ll = new LinkedList<String>();
	        ll.add("Orange");
	        ll.add("Apple");
	        ll.add("Grape");
	        ll.add("Banana");
	        System.out.println(ll);
	        System.out.println("Size of the linked list: "+ll.size());
	        System.out.println("Is LinkedList empty? "+ll.isEmpty());
	        System.out.println("Does LinkedList contains 'Grape'? "+ll.contains("Grape"));
	        
	        
	        
	        Iterator<String> itr = ll.iterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        }
	        
	        
	        
	        List<String> list = new ArrayList<String>();
	        list.add("one");
	        list.add("two");
	        ll.addAll(list);
	        System.out.println("After Copy: "+ll);
	        
	        
	        
	      // shuffle() method generates different order of output.  
	        
	        
	        Collections.shuffle(ll);
	        System.out.println("Results after shuffle operation:");
	        for(String str: ll){
	            System.out.println(str);
	        }
	         
	        Collections.shuffle(ll);
	        System.out.println("Results after shuffle operation:");
	        for(String str: ll){
	            System.out.println(str);
	        }
	        
	        
	        // Reversing the linkedlist
	        Collections.reverse(ll);
			System.out.println("Results after reverse operation:");
			for(String str: ll){
				System.out.println(str);}
			
			//Creating sublist
			List<String> sublist = ll.subList(2, 4);
	        System.out.println("Sub List: "+sublist);
	        
	        
	        
	        
	        

	}

}

