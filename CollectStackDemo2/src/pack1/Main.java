package pack1;

import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Stack st = new Stack();
	      
		   // populating stack
		   st.push("Java");
		   st.push("Source");
		   st.push("code");
		      
		   // removing top object
		   System.out.println("Removed object is: "+st.pop());
		      
		   // elements after remove
		   System.out.println("Elements after remove: "+st);
		   
		   System.out.println("Identifying the top element   "+st.peek());
           System.out.println("Search element "+st.search("Source"));
	}

}
