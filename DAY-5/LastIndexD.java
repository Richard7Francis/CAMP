package DAY5;
import java.util.Scanner;
public class LastIndexD {
	public static void main(String args[]) {
		Scanner r =new Scanner(System.in);
		String s = r.nextLine();
		char ch= r.next().charAt(0);
//		String s = "Richard";
		System.out.println(s.lastIndexOf(ch));
	}

}
