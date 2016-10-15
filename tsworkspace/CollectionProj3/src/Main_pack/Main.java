package Main_pack;

import java.util.LinkedList;
import java.util.Scanner;

import Consumerpack.Consumer;
import Consumerpack.Consumer_List;
import Order_pack.Order_List;
import Transaction.Purchase;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Purchase.View_CarDetails();	
	Scanner sc = new Scanner(System.in);
	long daysalesamt=0;
	//Consumer c1 = new Consumer(1,"Aruna",28542848,"1/4/2014");
	LinkedList<Consumer> orderList = Order_List.order();
	for (Consumer c1:orderList)
	{
	 System.out.println("\nPurchase Process Initiated");
	 System.out.println("Enter the car model number");
	 int mno = sc.nextInt();
	 c1.setModelid(mno);
	 System.out.println("Enter the Mode of payment");	 
	 String mode = sc.next();
	 c1.setPayment_info(mode);
	 c1.setBillamt(Purchase.Buy_Car(mno));
	 c1.printbill();
	 Consumer_List.SaveConsumer(c1);
	 }
	 
	 LinkedList<Consumer> clist = Consumer_List.getConsumerList();
	 
	 for (Consumer c1:clist)
	 {
		 daysalesamt+=c1.getBillamt();
	 }
	 
	 System.out.println("Total transacted amout for the day=  "+daysalesamt);
	
	}

}
