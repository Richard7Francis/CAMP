package DAY5;
import java.util.Scanner;
public class ByteD {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name");
		String s1 = s.next();
		byte[] s2=s1.getBytes();
		for(int i=0;i<s2.length;i++)
			System.out.println(s2[i]);
	}
}
