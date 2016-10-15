package Transaction;

import java.util.LinkedList;
import java.util.Scanner;

import Car_Pack.Car;
import Car_Pack.Car_List;

public class Purchase {
	
	static Car_List ob= new Car_List();
	
	
	public  static void  View_CarDetails()
	{
		LinkedList<Car>list = ob.CarList();
		
		/*for (Car c1:list)
		{
		   
		   
			   System.out.println("car Model"+c1.getModelname()+" amount of Rs. "+c1.getPrice());
		   
		}*/

	 ob.Display_CarInfo(list);
	}
	
	
	public static int Buy_Car(int mno)
	{
		int billamt=0;
		//String option;
		//boolean choice=true;
		//Scanner sc = new Scanner(System.in);
		
		//do
		//{
			/*System.out.println("Enter the car model number");
			 int mno = sc.nextInt();*/
			 LinkedList<Car>list = ob.CarList();	
		     for (Car ob:list)
		     {
		    	 if (ob.getModelid()==mno)
		    	 {
		    		 billamt+=ob.getPrice();
		    	 }
		    	 
		    		 
		     }
				
		/*System.out.println("Do you wish to continue");
		 option = sc.next();
		 if (option.equals("NO"))
		 	choice = false;
		 	
		}while(choice);*/
		
		
		return(billamt);
	}
	
	
	

}
