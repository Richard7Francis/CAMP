package Richard;
import java.util.Scanner;

class VC{
	void s(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
	}
}

public class VoCo {
	public static void main(String args[]) {
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter char: ");
		char ch= reader.next().charAt(0);
		VC n = new VC();
		n.s(ch);
	}
}
