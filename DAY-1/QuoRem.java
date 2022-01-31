package Richard;
import java.util.Scanner;
public class QuoRem {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter no.1 ");
		int n1= reader.nextInt();
		System.out.println("Enter no.2");
		int n2= reader.nextInt();
		System.out.println("Quotient="+(n1/n2));
		System.out.println("Remainder="+(n1%n2));
	}

}