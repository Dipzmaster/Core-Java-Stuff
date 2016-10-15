package pack;

import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
     CollectionUse c1 = new CollectionUse();
     ArrayList<Citizen> resultset = new ArrayList<Citizen>();
     resultset =c1.create();
     for (Citizen ob:resultset)
		{
			
    	 System.out.println(ob.getSsn()+"   "+ob.getName()+"   "+ob.getCountry());
		}
     
	}

}
