package Car_Pack;

import java.util.LinkedList;

public class Car_List {
	
	private Car c1 = new Car(800,"Maruthi ALTO","Hatchback",5,20,460000);
	private Car c2 = new Car(1000,"Maruthi ZEN","Comfortfit",5,16,560000);
	private Car c3 = new Car(1200,"Maruthi SWift","Hultipurpose",5,15,660000);
	private Car c4 = new Car(1500,"Mahendra XUV","Travelfit",7,20,1400000);
	
	public LinkedList<Car> CarList()
    {
    	 LinkedList<Car>  list = new LinkedList<Car>();
    	list.add(c1);
    	list.add(c2);
    	list.add(c3);
    	list.add(c4);
    	return list;
    	
    }
	
	
	//
    public void Display_CarInfo(LinkedList<Car> list)
	{
		 
		 
		for (Car c1:list)
		{
		   
		   
			   System.out.println("car Model"+c1.getModelname()+" amount of Rs. "+c1.getPrice());
		   
		}
		}


}
