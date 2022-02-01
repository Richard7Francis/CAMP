package Richard;
import java.util.Scanner;

class SW{
	void exc(int n1,int n2) {
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("n1 = "+n1+", n2 = "+n2);
	}
}

public class Swap {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter no.1");
		int n1=reader.nextInt();
		System.out.println("Enter no.2");
		int n2=reader.nextInt();
		SW n = new SW();
		n.exc(n1, n2);
	}

}