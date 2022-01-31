package Richard;
import java.util.Scanner;
public class EvOd {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter no.");
		int n=reader.nextInt();
		if (n%2==0) {
			System.out.println("Even");
		}
		else
			System.out.println("Odd");
	}

}