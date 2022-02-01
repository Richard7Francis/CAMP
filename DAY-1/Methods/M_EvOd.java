package Richard;
import java.util.Scanner;

class EO{
	String VD() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter no. : ");
		int n = r.nextInt();
		if (n%2==0)
			return("Even");
		else
			return("Odd");
	}
}
public class EvOd {
	public static void main(String args[]) {
		EO a = new EO();
		System.out.println(a.VD());
	}

}