package DAY8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class InputOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("abc.txt");
		FileOutputStream out = new FileOutputStream("output_abc.txt");
//		Reader readbin = new InputStreamReader(in);
		int i;
		while((i = in.read())!=-1) {
			out.write(i);
//			System.out.println((char) i);
		}
		in.close();
//		readbin.close();
		System.out.println("done");
	}

}
