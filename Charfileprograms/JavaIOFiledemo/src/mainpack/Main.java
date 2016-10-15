package mainpack;

import filepack.DataStreamClass;
import filepack.ReadWriteBytes;
import filepack.ReadWriteCharLine;
import filepack.ReadWriterCharFiles;

public class Main {

	public static void main(String[] args) {
		
		//
		/*ReadWriteBytes fob1 = new ReadWriteBytes();
		
		fob1.readWrite();*/
		
		//Read Write  using Character Streams
		
		
		/*ReadWriteCharLine fob2 = new ReadWriteCharLine();
		fob2.ReadWriteFile();*/
		
		//Read Write using Character Streams between files
		
		/*ReadWriterCharFiles fob3 = new ReadWriterCharFiles();
		
		fob3.ReadWriteFile();*/
		
		
		
		//Read from data from array using DataStream
		
		DataStreamClass fob4 = new DataStreamClass();
		
		fob4.ReadArrayWriteFile();
		fob4.writeDataFileSystem();
		
		

	}

}
