package pack1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadInputFile {

	public static void main(String[] args) {
		
		File filename = new File(args[0]);
		try( BufferedReader br = new BufferedReader( new FileReader(filename)))
		{
			String str = br.readLine();
			System.out.println(str);
			while(!(str.equals("End")))
			{
				
			 str = br.readLine();
			 System.out.println(str);
			 
			}		
					
		} catch (IOException e1| ) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 

	}

}
