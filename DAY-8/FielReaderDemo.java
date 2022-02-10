package DAY8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FielReaderDemo {
	public static void main(String args[]) throws IOException {
		FileReader ioreader = new FileReader("abc.txt");//mention the source for reading
		
		int i;

        while ((i = ioreader.read()) != -1) {
	    System.out.println((char) i);
        }

ioreader.close();  // close io connection usig close() api
	}

}
