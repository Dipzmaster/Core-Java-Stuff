package pack;

import java.util.*;
import java.util.Iterator;

public class createSet {
	Set hs = new HashSet();
	public void create()
	{
		hs.add(123);
		hs.add(13.45);
		hs.add(56F);
		hs.add("Kavya");
		
		Iterator it = hs.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
}	

}
