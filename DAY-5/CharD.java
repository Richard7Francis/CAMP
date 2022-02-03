package DAY5;

import java.util.Scanner;

public class CharD {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name");
		String s1 = s.next();
		char[] s2 = new char[4];
		s1.getChars(1,12,s2,0);
		System.out.println(s2);
	}
}
