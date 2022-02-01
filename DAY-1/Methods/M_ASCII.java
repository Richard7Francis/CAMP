package Richard;
import java.util.Scanner;

class conv{
	int ASC() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter char");
		char c = r.next().charAt(0);
		int i = c;
		return i;
		
	}
}
public class ASCII {
	public static void main(String args[]) {
		conv a = new conv();
		int c = a.ASC();
		System.out.println("The ASCII value is : "+c);
	}
}
