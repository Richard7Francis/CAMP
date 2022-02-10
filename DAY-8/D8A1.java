package DAY8Asgn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class D8A1 {
	public static void main(String[] args) throws IOException {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the file name");
		String filename = r.nextLine();
		System.out.println("Enter the character to be counted");
		char key = r.nextLine().charAt(0);
		
		File file = new File(filename);
		int Count = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		int ch;
		do {
			ch = br.read();
			
			if (ch >= 65 && ch <= 90) ch += 32;
			if (key >= 65 && key <= 90) key += 32;
			
			if (ch == key)
				Count++;
		} while (ch != -1);
				
		System.out.println("File '" + filename + "' has " +
				Count + " instances of letter '" + key + "'.");
		
		br.close();
		r.close();
	}
}
