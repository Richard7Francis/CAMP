package Richard;
import java.util.Scanner;

class Mul{
	float Mult() {
		Scanner r =new Scanner(System.in);
		System.out.println("Enter 2 nos.");
		float n1= r.nextFloat();
		float n2= r.nextFloat();
		return n1*n2;
	}
}

public class Multiply {
	public static void main(String args[]) {
	    Mul m = new Mul();
		System.out.println(m.Mult());
	}
}