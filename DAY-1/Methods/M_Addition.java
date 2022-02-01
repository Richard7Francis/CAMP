package Richard;
import java.util.Scanner;

class AddTwo {
	int add() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter no.1");
		int x = r.nextInt();
		System.out.println("Enter no.2");
		int y = r.nextInt();
		
		int s = x + y;
		return s;
	}
}

public class Addition {
	public static void main(String args[]) {
		AddTwo a = new AddTwo();
		int v = a.add();
		System.out.println("Sum of the two numbers = "+v);
}
}