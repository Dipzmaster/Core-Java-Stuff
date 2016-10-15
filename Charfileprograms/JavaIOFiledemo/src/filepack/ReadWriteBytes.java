package filepack;

import java.io.*;

public class ReadWriteBytes {
	
public void readWrite()
{
	try (FileInputStream in = new FileInputStream("C:/Users/Administrator/Desktop/file1.txt");
    		FileOutputStream out = new FileOutputStream("C:/Users/Administrator/Desktop/file2.txt");)
            {
        
        int c;

        while ((c = in.read()) != -1) {
            out.write(c);
        }
    } catch (FileNotFoundException e) {
		System.out.println("File not found");
	} 
    catch( IOException e)
    {
    	System.out.println("Exception arised during Reading the file");
    }
}

}
