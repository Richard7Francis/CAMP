package Richard;
import java.util.Scanner;

class QR{
	void Q(int n1, int n2) {
		System.out.println("Quotient="+(n1/n2));
	}
	void R(int n1, int n2) {
		System.out.println("Remainder="+(n1%n2));
	}
}

public class QuoRem {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter no.1 ");
		int n1= reader.nextInt();
		System.out.println("Enter no.2");
		int n2= reader.nextInt();
		QR n = new QR();
		n.Q(n1, n2);
		n.R(n1, n2);
	}

}