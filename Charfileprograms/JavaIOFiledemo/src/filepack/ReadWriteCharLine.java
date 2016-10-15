package filepack;

import java.io.*;

public class ReadWriteCharLine {
	
	public void ReadWriteFile()
	{
		//Reading from the keyboard and writing  to a file
		String s;
		File fileout = new File("C:\\Users\\Administrator\\Desktop\\file3.txt");
		try(
				InputStreamReader ir = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(ir);
				
				FileWriter fos = new FileWriter(fileout);
				PrintWriter out = new PrintWriter(fos);
						
				)
				{
			      
			    s= br.readLine();
			    
			    while(!(s.equals("End")))
			    {
			    	out.println(s);
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


