package filepack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadWriterCharFiles {
	public void ReadWriteFile()
	{
		//Reading from the file and writing  to a file
		String s;
		File filein = new File("C:\\Users\\Administrator\\Desktop\\file3.txt");
		File fileout = new File("C:\\Users\\Administrator\\Desktop\\file4.txt");
		try(
				FileReader  in = new FileReader(filein);
				BufferedReader br = new BufferedReader(in);
				
				FileWriter fos = new FileWriter(fileout);
				BufferedWriter out = new BufferedWriter(fos);
						
				)
				{
			      
			    s= br.readLine();
			    
			    while(!(s.equals("End")))
			    {
			    	 
			    	out.write(s);out.newLine();
			    	s= br.readLine();
			    }
			
			
				}
		        catch (FileNotFoundException e) {
		        	System.out.println("File not found");
		      } 
	           catch( IOException e)
	          {
	    	      System.out.println("Exception arised during Reading the file");
	         }
					
		}

}
