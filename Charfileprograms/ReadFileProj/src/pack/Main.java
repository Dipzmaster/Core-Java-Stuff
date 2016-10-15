package pack;

import java.io.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
            FileReader input = new FileReader("D:/Talent Sprint/greet.txt");
            BufferedReader rd = new BufferedReader(input);
             String str = rd.readLine();
             while ((str)
             {
                 System.out.println(str);
                 str =rd.readLine();
             }

        } catch (FileNotFoundException ex) {
           System.err.println("File not found "+ex);

            
        }
        catch(IOException e)
        {
            System.err.println("IO exception occured"+e);
        }


	}

}
