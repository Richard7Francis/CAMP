package Richard;
import java.util.Scanner;

class Large{
	int larg() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the 3 nos.");
		int n1= r.nextInt();
		int n2= r.nextInt();
		int n3= r.nextInt();
		return(n1>((n2>n3)?n2:n3)?n1:n2>n3?n2:n3);
	}
}

public class Largest {
	public static void main(String args[]) {
		Large l = new Large();
		System.out.println(l.larg());
	}
}