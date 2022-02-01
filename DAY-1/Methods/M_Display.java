package Richard;
import java.util.Scanner;

class printer{
	int p() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter no.");
		int n = r.nextInt();
		return n;
	}
}
public class Demo {
	public static void main(String args[]) {
		printer p = new printer();
		int n = p.p();
		System.out.println("The number is : "+n);
	}

}