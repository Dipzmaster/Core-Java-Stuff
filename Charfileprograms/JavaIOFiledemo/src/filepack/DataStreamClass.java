package filepack;

import java.io.*;

public class DataStreamClass {
	static final String dataFile = "C:\\Users\\Administrator\\Desktop\\invoicedata.dat";

	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = {
	    "Java T-shirt",
	    "Java Mug",
	    "Duke Juggling Dolls",
	    "Java Pin",
	    "Java Key Chain"
	};

	public void ReadArrayWriteFile()
	{
		try(
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
            new FileOutputStream(dataFile))))
            {
			
			for (int i = 0; i < prices.length; i ++) {
			    out.writeDouble(prices[i]);
			    out.writeInt(units[i]);
			    out.writeUTF(descs[i]);
			}
			
            }catch(IOException e)
		{
            	System.out.println("Io expection");
		}
			
	}
	
	public void writeDataFileSystem()
	{
	double price;
	int unit;
	String desc;
	double total = 0.0;

	
	  try(DataInputStream in = new DataInputStream(new
	            BufferedInputStream(new FileInputStream(dataFile)));)
	            {
		  while (true) {
		        price = in.readDouble();
		        unit = in.readInt();
		        desc = in.readUTF();
		        System.out.format("You ordered %d" + " units of %s at $%.2f%n",
		            unit, desc, price);
		        total += unit * price;
		    }
		  
		  	            }catch(IOException e)
	  {
	        System.out.println("IO exception raised");    	
	  }
	      finally
	      {
	    	  System.out.println(" Total amount  "+total);
	      }
	  
	}
	
	
}
